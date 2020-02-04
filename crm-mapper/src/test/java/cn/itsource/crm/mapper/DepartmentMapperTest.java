package cn.itsource.crm.mapper;

import cn.itsource.crm.BaseTest;
import cn.itsource.crm.domain.Department;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DepartmentMapperTest extends BaseTest {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Test
    public void test() throws Exception{
        System.out.println(departmentMapper.selectPageByQuery(null));
    }
}
