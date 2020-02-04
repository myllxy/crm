package cn.itsource.crm.mapper;

import cn.itsource.base.mapper.BaseMapper;
import cn.itsource.crm.domain.Permission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PermissionMapper extends BaseMapper<Permission, Long> {
    List<Permission> selectPermissionByRoleSn(@Param("sn") Long roleSn);
    Permission selectBySonSn(Long sn);
}
