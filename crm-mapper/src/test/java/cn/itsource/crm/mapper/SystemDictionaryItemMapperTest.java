package cn.itsource.crm.mapper;

import cn.itsource.crm.BaseTest;
import cn.itsource.crm.domain.SystemDictionaryItem;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author lb
 * @create 2020-01-10 17:24
 */
public class SystemDictionaryItemMapperTest extends BaseTest{
    @Autowired
    private SystemDictionaryItemMapper systemDictionaryItemMapper;
    @Test
    public void test() throws Exception{
//        //查询所有客户来源
//        List<SystemDictionaryItem> systemDictionaryItems = systemDictionaryItemMapper.selectCustomerSources();
//        for (SystemDictionaryItem systemDictionaryItem : systemDictionaryItems) {
//            System.out.println(systemDictionaryItem);
//        }
        System.out.println(systemDictionaryItemMapper.selectByRequence(1L));
    }
}
