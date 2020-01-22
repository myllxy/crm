package cn.itsource.crm.domain;

import cn.itsource.base.domain.BaseDomain;

import java.math.BigDecimal;

public class Contract extends BaseDomain {
    //合同单号
    private Long sn;
    //合同客户
    private Customer customer;
    //签订时间（前台传过来）
    private String signTime;
    //营销人员
    private Employee seller;
    //合同金额
    private BigDecimal sum;
    //合同摘要
    private String intro;
      /*//所属租户
    private Integer tenant_id;*/

    public Contract() {
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

    @Override
    public String toString() {
        return "Contract{" +
                "sn=" + sn +
                ", signTime=" + signTime +
                ", sum=" + sum +
                ", intro='" + intro + '\'' +
                '}';
    }
}
