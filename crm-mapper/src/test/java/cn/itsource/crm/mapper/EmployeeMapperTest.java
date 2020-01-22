package cn.itsource.crm.mapper;

import cn.itsource.crm.BaseTest;
import cn.itsource.crm.domain.Employee;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeMapperTest extends BaseTest {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    public void test() throws Exception {
        List<String> selectName = employeeMapper.selectName();
        for (String s : selectName) {
            System.out.println(s);
        }
    }
}
