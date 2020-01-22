package cn.itsource.crm.query;

import cn.itsource.base.query.BaseQuery;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class DetailsQuery extends BaseQuery {
    private String name;
    // 保修时间 ,由保修单的质保期自动生成
    private Date Timen;
    // 保修 明细
    private String contents;
    //是否解决
    private Boolean status;

    public Date getTimen() {
        return Timen;
    }
    public void setTimen(Date timen) {
        Timen = timen;
    }
    public String getContents() {
        return contents;
    }
    public void setContents(String contents) {
        this.contents = contents;
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
}
