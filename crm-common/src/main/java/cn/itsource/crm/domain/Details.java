package cn.itsource.crm.domain;

import cn.itsource.base.domain.BaseDomain;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Details extends BaseDomain{
    // 保修时间 ,由保修单的质保期自动生成
    private Date timen= new Date();
    //保修员工
    private String name;
    // 保修 明细
    private String contents;
    //是否解决
    private Boolean status;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getTimen() {
        return timen;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd")//
    public void setTimen(Date timen) {
        this.timen = timen;
    }

    @Override
    public String toString() {
        return "Details{" +
                "timen=" + timen +
                ", name='" + name + '\'' +
                ", contents='" + contents + '\'' +
                ", status=" + status +
                '}';
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
