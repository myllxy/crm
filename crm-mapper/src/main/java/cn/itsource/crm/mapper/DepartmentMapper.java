package cn.itsource.crm.mapper;

import cn.itsource.base.mapper.BaseMapper;
import cn.itsource.crm.domain.Department;

import java.util.List;

public interface DepartmentMapper extends BaseMapper<Department, Long> {
    List<Department> getDepartment();
}
