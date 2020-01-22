package cn.itsource.crm.mapper;

import cn.itsource.crm.BaseTest;
import cn.itsource.crm.domain.Customer;
import cn.itsource.crm.domain.Department;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerMapperTest extends BaseTest {

    @Autowired
    private CustomerMapper customerMapper;

    @Test
    public void test() throws Exception {
        List<Customer> customers = customerMapper.selectAll();
        customers.forEach(System.out::println);
    }
}
