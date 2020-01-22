package cn.itsource.crm.domain;

import cn.itsource.base.domain.BaseDomain;


/**
 * @author myllxy
 * @create 2020-01-10 14:56
 */
public class CustomerTraceHistory extends BaseDomain {
    private Customer customer;
    private Employee traceUser;
    private String traceTime;
    private SystemDictionaryItem traceType;
    private Integer traceResult;
    private String title;
    private String remark;


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public Employee getTraceUser() {
        return traceUser;
    }

    public void setTraceUser(Employee traceUser) {
        this.traceUser = traceUser;
    }

    public String getTraceTime() {
        return traceTime;
    }

    public void setTraceTime(String traceTime) {
        this.traceTime = traceTime;
    }

    public SystemDictionaryItem getTraceType() {
        return traceType;
    }

    public void setTraceType(SystemDictionaryItem traceType) {
        this.traceType = traceType;
    }

    public Integer getTraceResult() {
        return traceResult;
    }

    public void setTraceResult(Integer traceResult) {
        this.traceResult = traceResult;
    }


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
