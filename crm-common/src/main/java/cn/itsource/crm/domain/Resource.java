package cn.itsource.crm.domain;

import cn.itsource.base.domain.BaseDomain;

public class Resource extends BaseDomain {
    //资源名称
    private String name;
    //资源地址
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
