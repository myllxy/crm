package cn.itsource.crm.service.impl;

import cn.itsource.base.mapper.BaseMapper;
import cn.itsource.base.service.impl.BaseServiceImpl;
import cn.itsource.crm.domain.PotentialCustomer;
import cn.itsource.crm.mapper.PotentialCustomerMapper;
import cn.itsource.crm.service.IPotentialCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/*
* 潜在客户Service层
* */
@Service
public class PotentialCustomerServiceImpl extends BaseServiceImpl<PotentialCustomer,Long> implements IPotentialCustomerService {

    @Autowired
    private PotentialCustomerMapper potentialCustomerMapper;

    @Override
    public BaseMapper<PotentialCustomer, Long> getBaseMapper() {
        return potentialCustomerMapper;
    }

}
