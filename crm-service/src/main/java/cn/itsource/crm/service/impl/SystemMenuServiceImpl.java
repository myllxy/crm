package cn.itsource.crm.service.impl;

import cn.itsource.base.mapper.BaseMapper;
import cn.itsource.base.service.impl.BaseServiceImpl;
import cn.itsource.crm.domain.SystemMenu;
import cn.itsource.crm.mapper.SystemMenuMapper;
import cn.itsource.crm.service.ISystemMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SystemMenuServiceImpl extends BaseServiceImpl<SystemMenu,Long> implements ISystemMenuService {

    @Autowired
    private SystemMenuMapper systemMenuMapper;

    @Override
    public BaseMapper<SystemMenu, Long> getBaseMapper() {
        return systemMenuMapper;
    }



}
