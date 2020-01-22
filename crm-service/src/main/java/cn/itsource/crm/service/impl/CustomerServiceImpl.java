package cn.itsource.crm.service.impl;

import cn.itsource.base.mapper.BaseMapper;
import cn.itsource.base.service.impl.BaseServiceImpl;
import cn.itsource.crm.domain.Customer;
import cn.itsource.crm.domain.Department;
import cn.itsource.crm.mapper.CustomerMapper;
import cn.itsource.crm.mapper.DepartmentMapper;
import cn.itsource.crm.service.ICustomerService;
import cn.itsource.crm.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl extends BaseServiceImpl<Customer, Long> implements ICustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public BaseMapper<Customer, Long> getBaseMapper() {
        return customerMapper;
    }

}
