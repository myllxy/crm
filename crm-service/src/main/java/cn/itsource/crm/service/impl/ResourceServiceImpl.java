package cn.itsource.crm.service.impl;

import cn.itsource.base.mapper.BaseMapper;
import cn.itsource.base.service.impl.BaseServiceImpl;
import cn.itsource.crm.domain.Resource;
import cn.itsource.crm.mapper.ResourceMapper;
import cn.itsource.crm.service.IResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourceServiceImpl extends BaseServiceImpl<Resource,Long> implements IResourceService {

    @Autowired
    private ResourceMapper resourceMapper;

    @Override
    public BaseMapper<Resource, Long> getBaseMapper() {
        return resourceMapper;
    }



}
