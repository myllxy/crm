package cn.itsource.crm.service;

import cn.itsource.crm.domain.Bill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class BillServiceTest {
    @Autowired
    private IBillService billService;

    @Test
    public void test() throws Exception {
        Bill bill = new Bill();
        bill.setClient("AA");
        billService.save(bill);
    }
}
