package cn.itsource.crm.service;

import cn.itsource.base.util.PageResult;
import cn.itsource.crm.domain.CustomerDevPlan;
import cn.itsource.crm.domain.PotentialCustomer;
import cn.itsource.crm.query.CustomerDevPlanQuery;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CustomerDevPlanServiceTest {
    @Autowired
    private ICustomerDevPlanService customerDevPlanService;
    @Autowired
    private IPotentialCustomerService potentialCustomerService;
    @Test
    public void test() throws Exception {
        //添加测试
        /*CustomerDevPlan customerDevPlan = new CustomerDevPlan();
        customerDevPlan.setPlanTime(new Date());
        customerDevPlan.setInputTime(new Date());
        PotentialCustomer potentialCustomer = potentialCustomerService.selectById(1L);
        customerDevPlan.setPotentialCustomer(potentialCustomer);
        customerDevPlan.setPlanDetails("5555");
        customerDevPlan.setPlanSubject("5555");
        customerDevPlan.setPlanType("5555");
        customerDevPlanService.save(customerDevPlan);*/
        //查询测试
        /*List<CustomerDevPlan> customerDevPlans = customerDevPlanService.selectAll();
        for (CustomerDevPlan devPlan : customerDevPlans) {
            System.out.println(devPlan);
        }*/
        //查询单个
        //System.out.println(customerDevPlanService.selectById(5L));
        //删除测试
       //customerDevPlanService.delete(5L);
        //修改测试
        /*CustomerDevPlan customerDevPlan = new CustomerDevPlan();
        customerDevPlan.setId(5L);
        PotentialCustomer potentialCustomer = potentialCustomerService.selectById(1L);
        customerDevPlan.setPotentialCustomer(potentialCustomer);
        customerDevPlan.setPlanDetails("7777");
        customerDevPlan.setPlanSubject("7777");
        customerDevPlan.setPlanType("7777");
        customerDevPlanService.update(customerDevPlan);*/
        //根据条件分页查询
        CustomerDevPlanQuery customerDevPlanQuery = new CustomerDevPlanQuery();
        customerDevPlanQuery.setPlanSubject("蓝天计划");
        PageResult<CustomerDevPlan> customerDevPlanPageResult = customerDevPlanService.selectPageByQuery(customerDevPlanQuery);
        System.out.println(customerDevPlanPageResult.getResult());
        System.out.println(customerDevPlanPageResult.getTotal());
    }
}
