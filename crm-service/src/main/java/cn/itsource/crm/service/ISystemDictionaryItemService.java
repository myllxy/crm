package cn.itsource.crm.service;

import cn.itsource.base.service.IBaseService;
import cn.itsource.crm.domain.SystemDictionaryItem;

import java.util.List;

public interface ISystemDictionaryItemService extends IBaseService<SystemDictionaryItem, Long> {
    /**
     * 通过序列号来查找数据字典明细
     *
     * @param requence
     * @return
     */
    SystemDictionaryItem selectByRequence(Long requence);
    /*查询客户来源*/
    List<SystemDictionaryItem> selectCustomerSources();
    /*查询计划实施方式*/
    List<SystemDictionaryItem> selectPlanType();
}
