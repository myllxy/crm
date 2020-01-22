package cn.itsource.crm.service.impl;

import cn.itsource.base.mapper.BaseMapper;
import cn.itsource.base.service.impl.BaseServiceImpl;
import cn.itsource.crm.domain.Department;
import cn.itsource.crm.mapper.DepartmentMapper;
import cn.itsource.crm.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl extends BaseServiceImpl<Department,Long> implements IDepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public BaseMapper<Department, Long> getBaseMapper() {
        return departmentMapper;
    }



}
