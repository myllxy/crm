package cn.itsource.crm.service.impl;

import cn.itsource.base.mapper.BaseMapper;
import cn.itsource.base.service.impl.BaseServiceImpl;
import cn.itsource.crm.domain.Bill;
import cn.itsource.crm.mapper.BillMapper;
import cn.itsource.crm.service.IBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillServiceImpl extends BaseServiceImpl<Bill,Long> implements IBillService {

    @Autowired
    private BillMapper billMapper;

    @Override
    public BaseMapper<Bill, Long> getBaseMapper() {
        return billMapper;
    }

}
