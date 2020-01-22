package cn.itsource.crm.domain;

import cn.itsource.base.domain.BaseDomain;

public class Permission extends BaseDomain {
    //权限名称
    private String name;
    //资源地址
    private String resource;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }
}
