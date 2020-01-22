package cn.itsource.crm.service.impl;

import cn.itsource.base.mapper.BaseMapper;
import cn.itsource.base.service.impl.BaseServiceImpl;
import cn.itsource.crm.domain.Contract;
import cn.itsource.crm.domain.ContractPayDetail;
import cn.itsource.crm.mapper.ContractMapper;
import cn.itsource.crm.mapper.ContractPayDetailMapper;
import cn.itsource.crm.service.IContractPayDetailService;
import cn.itsource.crm.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractPayDetailServiceImpl extends BaseServiceImpl<ContractPayDetail,Long> implements IContractPayDetailService {

    @Autowired
    private ContractPayDetailMapper contractPayDetailMapper;

    @Override
    public BaseMapper<ContractPayDetail, Long> getBaseMapper() {
        return contractPayDetailMapper;
    }



}
