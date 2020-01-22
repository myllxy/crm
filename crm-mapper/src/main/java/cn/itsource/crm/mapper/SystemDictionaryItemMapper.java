package cn.itsource.crm.mapper;

import cn.itsource.base.mapper.BaseMapper;
import cn.itsource.crm.domain.SystemDictionaryItem;

import java.util.List;

public interface SystemDictionaryItemMapper extends BaseMapper<SystemDictionaryItem, Long> {
    SystemDictionaryItem selectByRequence(Long requence);

    /*查询客户来源*/
    List<SystemDictionaryItem> selectCustomerSources();

    /*查询计划实施方式*/
    List<SystemDictionaryItem> selectPlanType();

}
