package cn.itsource.crm.domain;

import cn.itsource.base.domain.BaseDomain;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;


//{
//    sn:ccc,
//        customer:{id:1},
//        signTime:2019-01-02
//
//        }
public class Order extends BaseDomain {
    //定金单号
    private String sn;
    //定金客户
    private Customer customer;
    //签订时间（前台传过来）
    private Date signTime;
    //营销人员
    private Employee seller;
    //定金金额
    private BigDecimal sum;
    //摘要
    private String intro;
    /*//所属租户
    private Integer tenant_id;*/

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")//前台到后台，时间格式化
    //交易世界按东八区，加8个小时（后台到前台）
    public Date getSignTime() {
        return signTime;
    }

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    public void setSignTime(Date signTime) {
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

    @Override
    public String toString() {
        return "Order{" +
                "sn=" + sn +
                ", signTime=" + signTime +
                ", sum=" + sum +
                ", intro='" + intro + '\'' +
                '}';
    }
}
