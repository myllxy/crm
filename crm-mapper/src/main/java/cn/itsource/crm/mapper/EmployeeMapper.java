package cn.itsource.crm.mapper;

import cn.itsource.base.mapper.BaseMapper;
import cn.itsource.crm.domain.Employee;

import java.util.List;

public interface EmployeeMapper extends BaseMapper<Employee, Long> {
    //根据员工查用户名
    Employee selectByUsername(String username);

    List<Employee> getEmployee();

    Employee getEmployeeBySn(Long sn);

    Employee getEmployeeByName(String name);
}


