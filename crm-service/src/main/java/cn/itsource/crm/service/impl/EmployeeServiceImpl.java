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
public class EmployeeServiceImpl extends BaseServiceImpl<Employee, Long> implements IEmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public BaseMapper<Employee, Long> getBaseMapper() {
        return employeeMapper;
    }

    @Override
    public void save(Employee employee) {
        super.save(employee);
        employeeMapper.saveRoleAndEmployee(employee.getRoles(), employee.getSn());
    }

    @Override
    public void update(Employee employee) {
        /* 同时要更新t_employee_role中间表 */
        employeeMapper.deleteRoleAndEmployee(employee.getSn());
        super.update(employee);
        employeeMapper.saveRoleAndEmployee(employee.getRoles(), employee.getSn());
    }

    @Override
    public void delete(Long id) {
        employeeMapper.deleteRoleAndEmployee(employeeMapper.selectById(id).getSn());
        super.delete(id);
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
