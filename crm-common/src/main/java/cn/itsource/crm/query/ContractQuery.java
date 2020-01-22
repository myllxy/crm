package cn.itsource.crm.query;

import cn.itsource.base.query.BaseQuery;
import org.springframework.format.annotation.DateTimeFormat;

public class ContractQuery extends BaseQuery {

   //合同号
    private String sn;

    //开始时间
    private String beginTime;
    //结束时间
    private String endTime;

    public String getBeginTime() {
        return beginTime;
    }
    //前台到后代日期，也需要格式化
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }
    //前台到后代日期，也需要格式化
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }
}



