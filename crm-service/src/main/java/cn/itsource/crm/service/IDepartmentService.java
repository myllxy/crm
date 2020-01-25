package cn.itsource.crm.service;

import cn.itsource.base.service.IBaseService;
import cn.itsource.crm.domain.Department;

import java.util.List;

public interface IDepartmentService extends IBaseService<Department, Long> {
    List<Department> getDepartment();
}
