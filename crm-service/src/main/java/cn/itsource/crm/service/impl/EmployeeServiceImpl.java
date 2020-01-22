package cn.itsource.crm.service.impl;

import cn.itsource.base.mapper.BaseMapper;
import cn.itsource.base.service.impl.BaseServiceImpl;
import cn.itsource.crm.domain.Department;
import cn.itsource.crm.domain.Employee;
import cn.itsource.crm.mapper.DepartmentMapper;
import cn.itsource.crm.mapper.EmployeeMapper;
import cn.itsource.crm.service.IDepartmentService;
import cn.itsource.crm.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl extends BaseServiceImpl<Employee,Long> implements IEmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public BaseMapper<Employee, Long> getBaseMapper() {
        return employeeMapper;
    }

    @Override
    public List<Employee> getEmployee() {
        return employeeMapper.getEmployee();
    }

    @Override
    public Employee getEmployeeBySn(Long sn) {
        return employeeMapper.getEmployeeBySn(sn);
    }

    @Override
    public Employee getEmployeeByName(String name) {
        return employeeMapper.getEmployeeByName(name);
    }

}
