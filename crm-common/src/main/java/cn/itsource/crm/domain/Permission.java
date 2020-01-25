package cn.itsource.crm.domain;

import cn.itsource.base.domain.BaseDomain;

import java.util.ArrayList;
import java.util.List;

public class Permission extends BaseDomain {
    private Long sn;
    //权限名称
    private String name;
    //资源地址
    private String resource;
    private List<Role> roles = new ArrayList<>();

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

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Long getSn() {
        return sn;
    }

    public void setSn(Long sn) {
        this.sn = sn;
    }

    public Permission() {
    }

    @Override
    public String toString() {
        return "Permission{" +
                "sn=" + sn +
                ", name='" + name + '\'' +
                ", resource='" + resource + '\'' +
                ", roles=" + roles +
                '}';
    }
}
