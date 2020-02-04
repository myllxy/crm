package cn.itsource.crm.mapper;

import cn.itsource.base.mapper.BaseMapper;
import cn.itsource.crm.domain.Employee;
import cn.itsource.crm.domain.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper extends BaseMapper<Employee, Long> {
    Employee selectByUsername(String username);

    List<Employee> getEmployee();

    Employee getEmployeeBySn(Long sn);

    Employee getEmployeeByName(String name);

    void saveRoleAndEmployee(@Param("roles") List<Role> roles, @Param("empSn") Long empSn);

    void deleteRoleAndEmployee(@Param("empSn") Long empSn);

    List<Role> queryRolesByEmployeeSn(@Param("sn") Long empSn);
}


