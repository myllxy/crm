package cn.itsource.crm.service;

import cn.itsource.base.service.IBaseService;
import cn.itsource.crm.domain.Permission;

import java.util.List;

public interface IPermissionService extends IBaseService<Permission, Long> {
    List<Permission> selectPermissionByRoleSn(Long roleSn);
    Permission selectBySonSn(Long sn);
}
