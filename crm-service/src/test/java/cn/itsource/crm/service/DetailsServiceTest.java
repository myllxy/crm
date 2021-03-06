package cn.itsource.crm.service;

import cn.itsource.crm.domain.Details;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class DetailsServiceTest {
    @Autowired
    private IDetailsService detailsService;

    @Test
    public void test() throws Exception {
        Details details = new Details();
        details.setName("AA");
        detailsService.save(details);
    }
}
