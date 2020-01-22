package cn.itsource.crm.query;

import cn.itsource.base.query.BaseQuery;
/*
* 潜在客户查询对象
* */
public class PotentialCustomerQuery extends BaseQuery {
    //潜在客户名称
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
