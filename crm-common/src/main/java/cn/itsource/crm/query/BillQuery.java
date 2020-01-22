package cn.itsource.crm.query;

import cn.itsource.base.query.BaseQuery;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class BillQuery extends BaseQuery {
    private String name;
    //保修客户
    private String client;
    //到期时间
    private Date Expire= new Date();

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Date getExpire() {
        return Expire;
    }

    public void setExpire(Date expire) {
        Expire = expire;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
