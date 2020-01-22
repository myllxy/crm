package cn.itsource.crm.mapper;

import cn.itsource.base.mapper.BaseMapper;
import cn.itsource.crm.domain.Permission;
import cn.itsource.crm.domain.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper extends BaseMapper<Role, Long> {
    /**
     * 保存中间表
     * @param roleId  角色id
     * @param permissions  权限
     */
    void saveRoleAndPermission(@Param("roleId") Long roleId, @Param("permissions") List<Permission> permissions);

    /**
     * 根据角色删除对应的权限（role_permission中间表）
     * @param roleId
     */
    void deleteRoleAndPermission(Long roleId);
}
