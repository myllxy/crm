package cn.itsource.crm.query;

import cn.itsource.base.query.BaseQuery;

public class CustomerTransferQuery extends BaseQuery {
    private String customer;

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}
