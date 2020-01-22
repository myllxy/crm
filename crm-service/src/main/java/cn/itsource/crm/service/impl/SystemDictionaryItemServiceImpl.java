package cn.itsource.crm.service.impl;

import cn.itsource.base.mapper.BaseMapper;
import cn.itsource.base.service.impl.BaseServiceImpl;
import cn.itsource.crm.domain.SystemDictionaryItem;
import cn.itsource.crm.mapper.SystemDictionaryItemMapper;
import cn.itsource.crm.service.ISystemDictionaryItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemDictionaryItemServiceImpl extends BaseServiceImpl<SystemDictionaryItem, Long> implements ISystemDictionaryItemService {

    @Autowired
    private SystemDictionaryItemMapper systemDictionaryItemMapper;

    @Override
    public BaseMapper<SystemDictionaryItem, Long> getBaseMapper() {
        return systemDictionaryItemMapper;
    }


    @Override
    public SystemDictionaryItem selectByRequence(Long requence) {
        return systemDictionaryItemMapper.selectByRequence(requence);
    }

    @Override
    public List<SystemDictionaryItem> selectCustomerSources() {
        return systemDictionaryItemMapper.selectCustomerSources();
    }

    @Override
    public List<SystemDictionaryItem> selectPlanType() {
        return systemDictionaryItemMapper.selectPlanType();
    }
}
