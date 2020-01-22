package cn.itsource.crm.service;

import cn.itsource.base.service.IBaseService;
import cn.itsource.crm.domain.Employee;
import cn.itsource.crm.domain.Tenant;

public interface ITenantService extends IBaseService<Tenant, Long> {
    //注册租户
    public void saveTenant(Employee employee);

}
