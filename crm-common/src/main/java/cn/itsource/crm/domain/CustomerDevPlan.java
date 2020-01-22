package cn.itsource.crm.domain;

import cn.itsource.base.domain.BaseDomain;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 潜在客户开发计划
 * @author lb
 * @create 2020-01-07 23:42
 */
public class CustomerDevPlan extends BaseDomain{
    //计划时间
    private Date planTime;
    //计划主题
    private String planSubject;
    //计划内容
    private String planDetails;
    //计划实施方式 多对一 多个开发计划对应一种实施方式
    private SystemDictionaryItem planType;
    //创建时间(系统时间)
    private Date inputTime = new Date();
    //创建人(市场专员) many2one(多个开发计划，一个市场专员负责)
    private Employee inputUser;
    //潜在用户 many2one 多个开发计划对应一个潜在用户(一个潜在客户可以被开发多次)
    private PotentialCustomer potentialCustomer;
    //开发状态
    private Integer developStatus=0;

    public Integer getDevelopStatus() {
        return developStatus;
    }

    public void setDevelopStatus(Integer developStatus) {
        this.developStatus = developStatus;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getPlanTime() {
        return planTime;
    }

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    public void setPlanTime(Date planTime) {
        this.planTime = planTime;
    }

    public String getPlanSubject() {
        return planSubject;
    }

    public void setPlanSubject(String planSubject) {
        this.planSubject = planSubject;
    }

    public String getPlanDetails() {
        return planDetails;
    }

    public void setPlanDetails(String planDetails) {
        this.planDetails = planDetails;
    }

    public SystemDictionaryItem getPlanType() {
        return planType;
    }

    public void setPlanType(SystemDictionaryItem planType) {
        this.planType = planType;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getInputTime() {
        return inputTime;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
    }

    public PotentialCustomer getPotentialCustomer() {
        return potentialCustomer;
    }

    public void setPotentialCustomer(PotentialCustomer potentialCustomer) {
        this.potentialCustomer = potentialCustomer;
    }

    public Employee getInputUser() {
        return inputUser;
    }

    public void setInputUser(Employee inputUser) {
        this.inputUser = inputUser;
    }

    @Override
    public String toString() {
        return "CustomerDevPlan{" +
                "planTime=" + planTime +
                ", planSubject='" + planSubject + '\'' +
                ", planDetails='" + planDetails + '\'' +
                ", planType='" + planType + '\'' +
                ", inputTime=" + inputTime +
                ", inputUser=" + inputUser +
                ", potentialCustomer=" + potentialCustomer +
                ", developStatus=" + developStatus +
                '}';
    }
}
