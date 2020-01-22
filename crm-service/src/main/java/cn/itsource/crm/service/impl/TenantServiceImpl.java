package cn.itsource.crm.service.impl;

import cn.itsource.base.mapper.BaseMapper;
import cn.itsource.base.service.impl.BaseServiceImpl;
import cn.itsource.crm.constant.CrmConstant;
import cn.itsource.crm.domain.Employee;
import cn.itsource.crm.domain.Tenant;
import cn.itsource.crm.mapper.EmployeeMapper;
import cn.itsource.crm.mapper.TenantMapper;
import cn.itsource.crm.service.ITenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TenantServiceImpl extends BaseServiceImpl<Tenant,Long> implements ITenantService {

    @Autowired
    private TenantMapper tenantMapper;

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public BaseMapper<Tenant, Long> getBaseMapper() {
        return tenantMapper;
    }


    @Override
    public void saveTenant(Employee employee) {
        //获取前端传递的租户对象
        Tenant tenant = employee.getTenant();
        tenantMapper.save(tenant);
        //租户管理人员
        employee.setType(CrmConstant.TENANT);
        employeeMapper.save(employee);
    }
}
