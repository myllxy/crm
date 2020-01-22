package cn.itsource.crm.service.impl;

import cn.itsource.base.mapper.BaseMapper;
import cn.itsource.base.service.impl.BaseServiceImpl;
import cn.itsource.crm.domain.SystemDictionary;
import cn.itsource.crm.mapper.SystemDictionaryMapper;
import cn.itsource.crm.service.ISystemDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SystemDictionaryServiceImpl extends BaseServiceImpl<SystemDictionary, Long> implements ISystemDictionaryService {

    @Autowired
    private SystemDictionaryMapper systemDictionaryMapper;

    @Override
    public BaseMapper<SystemDictionary, Long> getBaseMapper() {
        return systemDictionaryMapper;
    }

}
