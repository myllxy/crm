package cn.itsource.crm.domain;

import cn.itsource.base.domain.BaseDomain;

import java.util.ArrayList;
import java.util.List;

public class Department extends BaseDomain {
    //部门编号
    private Long sn;
    //部门名称
    private String name;
    //路径
    private String dirPath;
    //状态
    private Integer state;
    //部门经理 ? 关系
    private Employee manager;
    // 自连接 上级部门?
    private Department parent;
    //子部门?
    private List<Department> childrens = new ArrayList<>();

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

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Department getParent() {
        return parent;
    }

    public void setParent(Department parent) {
        this.parent = parent;
    }

    public List<Department> getChildrens() {
        return childrens;
    }

    public void setChildrens(List<Department> childrens) {
        this.childrens = childrens;
    }

    public String getDirPath() {
        return dirPath;
    }

    public void setDirPath(String dirPath) {
        this.dirPath = dirPath;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }


}
