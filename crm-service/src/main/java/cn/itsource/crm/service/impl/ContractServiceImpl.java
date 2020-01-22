package cn.itsource.crm.service.impl;

import cn.itsource.base.mapper.BaseMapper;
import cn.itsource.base.service.impl.BaseServiceImpl;
import cn.itsource.crm.domain.Contract;
import cn.itsource.crm.mapper.ContractMapper;
import cn.itsource.crm.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractServiceImpl extends BaseServiceImpl<Contract,Long> implements IContractService {

    @Autowired
    private ContractMapper contractMapper;

    @Override
    public BaseMapper<Contract, Long> getBaseMapper() {
        return contractMapper;
    }



}
