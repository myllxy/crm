package cn.itsource.crm.mapper;

import cn.itsource.crm.BaseTest;
import cn.itsource.crm.domain.Bill;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BillMapperTest extends BaseTest {

    @Autowired
    private BillMapper billMapper;

    @Test
    public void test() throws Exception{
        for (Bill bill : billMapper.selectAll()) {
            System.out.println(bill);
        }
    }
}
