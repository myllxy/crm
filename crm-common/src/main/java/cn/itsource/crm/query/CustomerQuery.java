package cn.itsource.crm.query;

import cn.itsource.base.query.BaseQuery;

public class CustomerQuery extends BaseQuery {
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
