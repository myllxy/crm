package cn.itsource.crm.query;

import cn.itsource.base.query.BaseQuery;

public class SystemLogQuery extends BaseQuery {
    private String opUser;

    public String getOpUser() {
        return opUser;
    }

    public void setOpUser(String opUser) {
        this.opUser = opUser;
    }
}
