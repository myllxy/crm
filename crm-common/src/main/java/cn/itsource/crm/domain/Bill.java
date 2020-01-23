package cn.itsource.crm.domain;

import cn.itsource.base.domain.BaseDomain;

import java.util.Date;

public class Bill extends BaseDomain {
    /* 保修客户 */
    private Customer customer;
    /* 保修人员 */
    private Employee employee;
    /* 到期时间 */
    private Date dueTime = new Date();

    public Bill() {
    }

    public Bill(Customer customer, Employee employee, Date dueTime) {

        this.customer = customer;
        this.employee = employee;
        this.dueTime = dueTime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getDueTime() {
        return dueTime;
    }

    public void setDueTime(Date dueTime) {
        this.dueTime = dueTime;
    }
}