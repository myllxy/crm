package cn.itsource.crm.mapper;

import cn.itsource.crm.BaseTest;
import cn.itsource.crm.domain.PotentialCustomer;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class PotentialCustomerMapperTest extends BaseTest {

    @Autowired
    private PotentialCustomerMapper potentialCustomerMapper;

    @Test
    public void test() throws Exception{
        for (PotentialCustomer potentialCustomer : potentialCustomerMapper.selectAll()) {
            System.out.println(potentialCustomer);
        }
    }
}
