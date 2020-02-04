package cn.itsource.crm.service;

import cn.itsource.base.service.IBaseService;
import cn.itsource.crm.domain.Employee;
import cn.itsource.crm.domain.Role;

import java.util.List;

public interface IEmployeeService extends IBaseService<Employee, Long> {
    List<Employee> getEmployee();

    Employee getEmployeeBySn(Long sn);

    Employee getEmployeeByName(String name);

    List<Role> queryRolesByEmployeeSn(Long empSn);
}
