package cn.itsource.crm.domain;

import cn.itsource.base.domain.BaseDomain;

import java.util.ArrayList;
import java.util.List;

public class Role extends BaseDomain {
    //编码
    private String sn;
    //角色名称
    private String name;
    //相关权限  多对多
    private List<Permission> permissions = new ArrayList<>();

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
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

    @Override
    public String toString() {
        return "Role{" +
                "sn='" + sn + '\'' +
                ", name='" + name + '\'' +
                ", permissions=" + permissions +
                '}';
    }
}
