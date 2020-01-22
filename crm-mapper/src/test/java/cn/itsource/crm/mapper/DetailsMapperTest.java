package cn.itsource.crm.mapper;

import cn.itsource.crm.BaseTest;
import cn.itsource.crm.domain.Details;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DetailsMapperTest extends BaseTest {

    @Autowired
    private DetailsMapper detailsMapper;

    @Test
    public void test() throws Exception{
        for (Details details : detailsMapper.selectAll()) {
            System.out.println(details);
        }
    }
}
