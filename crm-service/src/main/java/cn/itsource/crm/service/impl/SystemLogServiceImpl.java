package cn.itsource.crm.service.impl;

import cn.itsource.base.mapper.BaseMapper;
import cn.itsource.base.service.impl.BaseServiceImpl;
import cn.itsource.crm.domain.Employee;
import cn.itsource.crm.domain.SystemLog;
import cn.itsource.crm.mapper.EmployeeMapper;
import cn.itsource.crm.mapper.SystemLogMapper;
import cn.itsource.crm.service.IEmployeeService;
import cn.itsource.crm.service.ISystemLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SystemLogServiceImpl extends BaseServiceImpl<SystemLog,Long> implements ISystemLogService {

    @Autowired
    private SystemLogMapper systemLogMapper;

    @Override
    public BaseMapper<SystemLog, Long> getBaseMapper() {
        return systemLogMapper;
    }



}
