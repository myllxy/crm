package cn.itsource.crm.mapper;

import cn.itsource.base.mapper.BaseMapper;
import cn.itsource.crm.domain.Permission;
import cn.itsource.crm.domain.SystemMenu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SystemMenuMapper extends BaseMapper<SystemMenu, Long> {
    List<SystemMenu> getMenus();

    SystemMenu getMenusByPermission(@Param("permission") Permission permission);
}
