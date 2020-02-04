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
    private List<Permission> children = new ArrayList<>();
    private Permission parent;


    public List<Permission> getChildren() {
        return children;
    }

    public Permission(Long sn, String name, String resource, List<Role> roles, List<Permission> children, Permission parent) {
        this.sn = sn;
        this.name = name;
        this.resource = resource;
        this.roles = roles;
        this.children = children;
        this.parent = parent;
    }

    public Permission getParent() {
        return parent;
    }

    public void setParent(Permission parent) {
        this.parent = parent;
    }

    public void setChildren(List<Permission> children) {
        this.children = children;
    }

    /**
     * 根据前端格式处理数据
     *
     * @return
     */
    public String getPid() {
        if (this.getResource().equals("/")) {
            return "0";
        }
        return String.valueOf(this.getParent().getId());
    }


    public String getName() {
        return name;
    }

    public String getLabel() {
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
                ", children=" + children +
                ", parent=" + parent +
                '}';
    }
}
