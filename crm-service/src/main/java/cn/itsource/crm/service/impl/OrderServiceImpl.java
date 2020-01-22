package cn.itsource.crm.service.impl;

import cn.itsource.base.mapper.BaseMapper;
import cn.itsource.base.service.impl.BaseServiceImpl;
import cn.itsource.crm.domain.Order;
import cn.itsource.crm.mapper.DepartmentMapper;
import cn.itsource.crm.mapper.OrderMapper;
import cn.itsource.crm.service.IDepartmentService;
import cn.itsource.crm.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends BaseServiceImpl<Order,Long> implements IOrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public BaseMapper<Order, Long> getBaseMapper() {
        return orderMapper;
    }

}
