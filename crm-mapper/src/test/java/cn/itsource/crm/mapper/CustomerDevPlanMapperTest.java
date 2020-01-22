package cn.itsource.crm.mapper;

import cn.itsource.crm.BaseTest;
import cn.itsource.crm.domain.CustomerDevPlan;
import cn.itsource.crm.domain.PotentialCustomer;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class CustomerDevPlanMapperTest extends BaseTest {

    @Autowired
    private CustomerDevPlanMapper customerDevPlanMapper;
    @Autowired
    private PotentialCustomerMapper potentialCustomerMapper;

    @Test
    public void test() throws Exception{
        /*for (CustomerDevPlan customerDevPlan : customerDevPlanMapper.selectAll()) {
            System.out.println(customerDevPlan);
        }*/
        //添加开发计划测试
        /*CustomerDevPlan customerDevPlan = new CustomerDevPlan();
        customerDevPlan.setPlanTime(new Date());
        customerDevPlan.setInputTime(new Date());
        PotentialCustomer potentialCustomer = potentialCustomerMapper.selectById(1L);
        customerDevPlan.setPotentialCustomer(potentialCustomer);
        customerDevPlan.setPlanDetails("999999");
        customerDevPlan.setPlanSubject("999999");
        customerDevPlan.setPlanType("999999");
        customerDevPlanMapper.save(customerDevPlan);*/
        //删除测试
        //修改测试
        CustomerDevPlan customerDevPlan = new CustomerDevPlan();
        customerDevPlan.setId(3L);
        PotentialCustomer potentialCustomer = potentialCustomerMapper.selectById(4L);
        customerDevPlan.setPotentialCustomer(potentialCustomer);
        customerDevPlan.setPlanDetails("88888");
        customerDevPlan.setPlanSubject("88888");
        customerDevPlanMapper.update(customerDevPlan);
    }
}
