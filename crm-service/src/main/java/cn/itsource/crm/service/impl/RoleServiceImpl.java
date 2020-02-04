package cn.itsource.crm.service.impl;

import cn.itsource.base.mapper.BaseMapper;
import cn.itsource.base.service.impl.BaseServiceImpl;
import cn.itsource.crm.domain.Permission;
import cn.itsource.crm.domain.Role;
import cn.itsource.crm.mapper.RoleMapper;
import cn.itsource.crm.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleServiceImpl extends BaseServiceImpl<Role, Long> implements IRoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public BaseMapper<Role, Long> getBaseMapper() {
        return roleMapper;
    }

    @Override
    public void save(Role role) {
        //保存角色  主键id有值了
        super.save(role);
        //保存中间表
        List<Permission> permissions = role.getPermissions();
        //保存中间表
        roleMapper.saveRoleAndPermission(permissions, role.getSn());
    }

    @Override
    public void update(Role role) {
        System.out.println("ssss");
        /* 平铺权限 */
        List<Permission> parentPermissions = role.getPermissions();
        ArrayList<Permission> resultPermissions = new ArrayList<>();
        for (Permission parentPermission : parentPermissions) {
            resultPermissions.add(parentPermission);
            for (Permission childPermission : parentPermission.getChildren()) {
                resultPermissions.add(childPermission);
            }
        }
        role.setPermissions(resultPermissions);
        //先删除中间表
        roleMapper.deleteRoleAndPermission(role.getSn());
        //再修改角色
        super.update(role);
        //保存中间表
        roleMapper.saveRoleAndPermission(role.getPermissions(), role.getSn());
    }

    @Override
    public void delete(Long roleSn) {
        //删除中间表
        roleMapper.deleteRoleAndPermission(roleSn);
        //删除角色
        super.delete(roleSn);
    }

    @Override
    public List<Role> getRoles() {
        return roleMapper.getRoles();
    }
}
