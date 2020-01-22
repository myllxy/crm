package cn.itsource.crm.domain;

import cn.itsource.base.domain.BaseDomain;

/**
 * @author myllxy
 * @create 2020-01-10 14:56
 */
public class CustomerTransfer extends BaseDomain {
    private Customer customer;
    private Employee transUser;
    private String transTime;
    private Employee oldSeller;
    private Employee newSeller;
    private String transReason;

    @Override
    public String toString() {
        return "CustomerTransfer{" +
                "customer=" + customer +
                ", transUser=" + transUser +
                ", transTime='" + transTime + '\'' +
                ", oldSeller=" + oldSeller +
                ", newSeller=" + newSeller +
                ", transReason='" + transReason + '\'' +
                '}';
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getTransUser() {
        return transUser;
    }

    public void setTransUser(Employee transUser) {
        this.transUser = transUser;
    }

    public String getTransTime() {
        return transTime;
    }

    public void setTransTime(String transTime) {
        this.transTime = transTime;
    }

    public Employee getOldSeller() {
        return oldSeller;
    }

    public void setOldSeller(Employee oldSeller) {
        this.oldSeller = oldSeller;
    }

    public Employee getNewSeller() {
        return newSeller;
    }

    public void setNewSeller(Employee newSeller) {
        this.newSeller = newSeller;
    }

    public String getTransReason() {
        return transReason;
    }

    public void setTransReason(String transReason) {
        this.transReason = transReason;
    }

    public CustomerTransfer() {
    }

    public CustomerTransfer(Customer customer, Employee transUser, String transTime, Employee oldSeller, Employee newSeller, String transReason) {
        this.customer = customer;
        this.transUser = transUser;
        this.transTime = transTime;
        this.oldSeller = oldSeller;
        this.newSeller = newSeller;
        this.transReason = transReason;
    }
}
