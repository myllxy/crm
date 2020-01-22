package cn.itsource.crm.service;

import cn.itsource.crm.domain.Customer;
import cn.itsource.crm.domain.Department;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CustomerServiceTest {
    @Autowired
    private ICustomerService customerService;

    @Test
    public void test() throws Exception {
        System.out.println(customerService.selectAll());
    }
}
