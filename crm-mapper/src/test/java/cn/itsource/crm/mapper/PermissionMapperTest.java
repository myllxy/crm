package cn.itsource.crm.mapper;

import cn.itsource.crm.BaseTest;
import cn.itsource.crm.domain.Permission;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class PermissionMapperTest extends BaseTest {

    @Autowired
    private PermissionMapper permissionMapper;

    @Test
    public void test() throws Exception {
        System.out.println(permissionMapper.selectAll());
    }
}
