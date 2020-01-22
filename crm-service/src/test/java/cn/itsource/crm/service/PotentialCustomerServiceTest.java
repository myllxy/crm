package cn.itsource.crm.service;

import cn.itsource.base.util.PageResult;
import cn.itsource.crm.domain.PotentialCustomer;
import cn.itsource.crm.query.PotentialCustomerQuery;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class PotentialCustomerServiceTest {
    @Autowired
    private IPotentialCustomerService potentialCustomerService;

    @Test
    public void test() throws Exception {
        //添加测试
        /*PotentialCustomer potentialCustomer = new PotentialCustomer();
        potentialCustomer.setName("KK");
        potentialCustomer.setCustomerSource("老客户推荐");
        potentialCustomer.setLinkMan("君君");
        potentialCustomer.setLinkManTel("12345678991");
        potentialCustomer.setSuccessRate(88);
        potentialCustomer.setRemark("这个潜在用户不简单");
        potentialCustomerService.save(potentialCustomer);*/
        //查询测试
       /* List<PotentialCustomer> potentialCustomers = potentialCustomerService.selectAll();
        for (PotentialCustomer potentialCustomer : potentialCustomers) {
            System.out.println(potentialCustomer);
        }*/
       //删除测试
       //potentialCustomerService.delete(2L);
        //修改测试
        PotentialCustomer potentialCustomer = new PotentialCustomer();
        potentialCustomer.setId(5L);
        potentialCustomer.setName("来来来去去去去");
//        potentialCustomer.setCustomerSource("dangdang");
        potentialCustomer.setLinkMan("iiiiii");
        potentialCustomer.setLinkManTel("168464755341");
        potentialCustomer.setSuccessRate(58);
        potentialCustomer.setRemark("afhuighfa");
        potentialCustomerService.update(potentialCustomer);
        //根据条件分页查询
        PotentialCustomerQuery potentialCustomerQuery = new PotentialCustomerQuery();
        potentialCustomerQuery.setName("KK");
        PageResult<PotentialCustomer> potentialCustomerPageResult = potentialCustomerService.selectPageByQuery(potentialCustomerQuery);
        System.out.println(potentialCustomerPageResult.getTotal()+"-----"+potentialCustomerPageResult.getResult());
    }
}
