package cn.itsource.crm.domain;

import cn.itsource.base.domain.BaseDomain;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
/*
* 潜在客户
* */
public class PotentialCustomer extends BaseDomain{
    //潜在客户名称
    private String name;
    //成功机率
    private Integer successRate;
    //客户描述
    private String remark;
    //联系人
    private String linkMan;
    //联系人电话
    private String linkManTel;
    //创建时间
    private Date inputTime = new Date();
    //创建人(市场专员或者销售主管)多对一
    private Employee inputUser;
    //客户来源 多对一（多个客户可以都是电话访问这一种来源）
    private SystemDictionaryItem customerSource;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SystemDictionaryItem getCustomerSource() {
        return customerSource;
    }

    public void setCustomerSource(SystemDictionaryItem customerSource) {
        this.customerSource = customerSource;
    }

    public Integer getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(Integer successRate) {
        this.successRate = successRate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getLinkMan() {
        return linkMan;
    }

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan;
    }

    public String getLinkManTel() {
        return linkManTel;
    }

    public void setLinkManTel(String linkManTel) {
        this.linkManTel = linkManTel;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getInputTime() {
        return inputTime;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
    }

    public Employee getInputUser() {
        return inputUser;
    }

    public void setInputUser(Employee inputUser) {
        this.inputUser = inputUser;
    }

    @Override
    public String toString() {
        return "PotentialCustomer{" +
                "name='" + name + '\'' +
                ", successRate=" + successRate +
                ", remark='" + remark + '\'' +
                ", linkMan='" + linkMan + '\'' +
                ", linkManTel='" + linkManTel + '\'' +
                ", inputTime=" + inputTime +
                ", inputUser=" + inputUser +
                ", customerSource=" + customerSource +
                '}';
    }
}
