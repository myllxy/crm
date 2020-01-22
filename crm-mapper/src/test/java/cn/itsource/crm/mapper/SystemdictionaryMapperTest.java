package cn.itsource.crm.mapper;

import cn.itsource.crm.BaseTest;
import cn.itsource.crm.domain.SystemDictionary;
import cn.itsource.crm.domain.SystemDictionaryItem;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SystemdictionaryMapperTest extends BaseTest {

    @Autowired
    private SystemDictionaryMapper systemDictionaryMapper;

    @Test
    public void test() throws Exception {
        SystemDictionary systemDictionary = systemDictionaryMapper.selectBySn(1L);
        List<SystemDictionaryItem> details = systemDictionary.getDetails();
        details.forEach(System.out::println);
    }
}
