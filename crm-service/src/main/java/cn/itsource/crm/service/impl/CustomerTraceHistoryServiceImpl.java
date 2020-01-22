package cn.itsource.crm.service.impl;

import cn.itsource.base.mapper.BaseMapper;
import cn.itsource.base.service.impl.BaseServiceImpl;
import cn.itsource.crm.domain.CustomerTraceHistory;
import cn.itsource.crm.mapper.CustomerTraceHistoryMapper;
import cn.itsource.crm.service.ICustomerTraceHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerTraceHistoryServiceImpl extends BaseServiceImpl<CustomerTraceHistory, Long> implements ICustomerTraceHistoryService {

    @Autowired
    private CustomerTraceHistoryMapper customerTraceHistoryMapper;

    @Override
    public BaseMapper<CustomerTraceHistory, Long> getBaseMapper() {
        return customerTraceHistoryMapper;
    }

}
