package cn.itsource.crm.domain;

import cn.itsource.base.domain.BaseDomain;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;

public class Order extends BaseDomain {
    /* 定金单号 */
    private Long sn;
    /* 定金客户 */
    private Customer customer;
    /* 签订时间（前台传过来） */
    private String signTime;
    /* 营销人员 */
    private Employee seller;
    /* 定金金额 */
    private BigDecimal sum;
    /* 摘要 */
    private String intro;
    /* 所属租户 */
    private String Tenant;

    public Order() {
    }

    public Order(Long sn, Customer customer, String signTime, Employee seller, BigDecimal sum, String intro, String tenant) {

        this.sn = sn;
        this.customer = customer;
        this.signTime = signTime;
        this.seller = seller;
        this.sum = sum;
        this.intro = intro;
        Tenant = tenant;
    }

    public Long getSn() {
        return sn;
    }

    public void setSn(Long sn) {
        this.sn = sn;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getSignTime() {
        return signTime;
    }

    public void setSignTime(String signTime) {
        this.signTime = signTime;
    }

    public Employee getSeller() {
        return seller;
    }

    public void setSeller(Employee seller) {
        this.seller = seller;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getTenant() {
        return Tenant;
    }

    public void setTenant(String tenant) {
        Tenant = tenant;
    }
}
