package cn.itsource.crm.service.impl;

import cn.itsource.base.mapper.BaseMapper;
import cn.itsource.base.service.impl.BaseServiceImpl;
import cn.itsource.crm.domain.Details;
import cn.itsource.crm.mapper.DetailsMapper;
import cn.itsource.crm.service.IDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailsServiceImpl extends BaseServiceImpl<Details,Long> implements IDetailsService {

    @Autowired
    private DetailsMapper detailsMapper;

    @Override
    public BaseMapper<Details, Long> getBaseMapper() {
        return detailsMapper;
    }

}
