package cn.itsource.crm.service;

import cn.itsource.base.service.IBaseService;
import cn.itsource.crm.domain.Permission;
import cn.itsource.crm.domain.SystemMenu;

import java.util.List;

public interface ISystemMenuService extends IBaseService<SystemMenu, Long> {
    List<SystemMenu> getMenus();

    List<SystemMenu> getMenusByPermission(List<Permission> permissions);
}
