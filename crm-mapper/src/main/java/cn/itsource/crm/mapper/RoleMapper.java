package cn.itsource.crm.mapper;

import cn.itsource.base.mapper.BaseMapper;
import cn.itsource.crm.domain.Permission;
import cn.itsource.crm.domain.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper extends BaseMapper<Role, Long> {
    /**
     * 保存中间表
     *
     * @param roleSn      角色sn
     * @param permissions 权限
     */
    void saveRoleAndPermission(@Param("permissions") List<Permission> permissions, @Param("roleSn") Long roleSn);

    /**
     * 根据角色删除对应的权限（role_permission中间表）
     *
     * @param roleSn
     */
    void deleteRoleAndPermission(@Param("roleSn") Long roleSn);
}
