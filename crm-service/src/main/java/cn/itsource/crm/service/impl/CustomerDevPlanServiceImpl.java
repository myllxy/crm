package cn.itsource.crm.service.impl;

import cn.itsource.base.mapper.BaseMapper;
import cn.itsource.base.service.impl.BaseServiceImpl;
import cn.itsource.crm.domain.CustomerDevPlan;
import cn.itsource.crm.mapper.CustomerDevPlanMapper;
import cn.itsource.crm.service.ICustomerDevPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
* 潜在客户Service层
* */
@Service
public class CustomerDevPlanServiceImpl extends BaseServiceImpl<CustomerDevPlan,Long> implements ICustomerDevPlanService {

    @Autowired
    private CustomerDevPlanMapper customerDevPlanMapper;

    @Override
    public BaseMapper<CustomerDevPlan, Long> getBaseMapper() {
        return customerDevPlanMapper;
    }

}
