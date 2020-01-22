package cn.itsource.crm.service.impl;

import cn.itsource.base.mapper.BaseMapper;
import cn.itsource.base.service.impl.BaseServiceImpl;
import cn.itsource.crm.domain.Permission;
import cn.itsource.crm.mapper.PermissionMapper;
import cn.itsource.crm.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermissionServiceImpl extends BaseServiceImpl<Permission,Long> implements IPermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public BaseMapper<Permission, Long> getBaseMapper() {
        return permissionMapper;
    }



}
