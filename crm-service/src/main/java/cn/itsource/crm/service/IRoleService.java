package cn.itsource.crm.service;

import cn.itsource.base.service.IBaseService;
import cn.itsource.crm.domain.Role;

import java.util.List;

public interface IRoleService extends IBaseService<Role, Long> {
    List<Role> getRoles();
}
