package cn.itsource.crm.domain;

import cn.itsource.base.domain.BaseDomain;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Bill extends BaseDomain {
    //保修客户
    private String client;
    //保修人员
    private String name;
    //到期时间
    private Date mins = new Date();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {

        this.client = client;
    }
    //前台展示
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getMins() {
        return mins;
    }

    // 后台 返回回时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public void setMins(Date mins) {
        this.mins = mins;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "client='" + client + '\'' +
                ", name='" + name + '\'' +
                ", mins=" + mins +
                '}';
    }
}