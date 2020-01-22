package cn.itsource.crm.domain;

import cn.itsource.base.domain.BaseDomain;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class ContractPayDetail extends BaseDomain {
    //所属合同
    private Contract contract;
    //付款时间（前台传过来）
    private Date payTime;
    //付款金额
    private BigDecimal money;
    //所占比例
    private BigDecimal scale;
    //是否支付，默认0，未支付，1表示已支付
    private Integer isPayment = 0;

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")//前台到后台，时间格式化
    public Date getPayTime() {
        return payTime;
    }
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getScale() {
        return scale;
    }

    public void setScale(BigDecimal scale) {
        this.scale = scale;
    }

    public Integer getIsPayment() {
        return isPayment;
    }

    public void setIsPayment(Integer isPayment) {
        this.isPayment = isPayment;
    }

    @Override
    public String toString() {
        return "ContractPayDetail{" +
                "signTime=" + payTime +
                ", money=" + money +
                ", scale=" + scale +
                ", isPayment=" + isPayment +
                '}';
    }
}
