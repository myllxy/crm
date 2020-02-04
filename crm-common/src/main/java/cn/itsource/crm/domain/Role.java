package cn.itsource.crm.domain;

import cn.itsource.base.domain.BaseDomain;

import java.util.ArrayList;
import java.util.List;

public class Role extends BaseDomain {
    //编码
    private Long sn;
    //角色名称
    private String name;
    //相关权限  多对多
    private List<Permission> permissions = new ArrayList<>();

    public Long getSn() {
        return sn;
    }

    public void setSn(Long sn) {
        this.sn = sn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public Role() {
    }

    @Override
    public String toString() {
        return "Role{" +
                "sn=" + sn +
                ", name='" + name + '\'' +
                ", permissions=" + permissions +
                '}';
    }
}
