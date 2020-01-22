package cn.itsource.crm.service.impl;

import cn.itsource.base.mapper.BaseMapper;
import cn.itsource.base.service.impl.BaseServiceImpl;
import cn.itsource.crm.domain.CustomerTraceHistory;
import cn.itsource.crm.domain.CustomerTransfer;
import cn.itsource.crm.mapper.CustomerTraceHistoryMapper;
import cn.itsource.crm.mapper.CustomerTransferMapper;
import cn.itsource.crm.service.ICustomerTraceHistoryService;
import cn.itsource.crm.service.ICustomerTransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerTransferServiceImpl extends BaseServiceImpl<CustomerTransfer, Long> implements ICustomerTransferService {

    @Autowired
    private CustomerTransferMapper customerTransferMapper;

    @Override
    public BaseMapper<CustomerTransfer, Long> getBaseMapper() {
        return customerTransferMapper;
    }

}
