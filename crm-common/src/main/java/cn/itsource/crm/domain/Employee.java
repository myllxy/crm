package cn.itsource.crm.domain;

import cn.itsource.base.domain.BaseDomain;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employee extends BaseDomain {
    //用户名
    private String username;
    //真实名
    private String realName;
    //密码
    private String password;
    //电话
    private String tel;
    //邮箱
    private String email;
    //录入时间
    private String inputTime;
    //状态     0 正常 ，-1离职
    private Integer state = 0;
    //0  普通员工    1   租户管理员      2超级管理员
    private Integer type;
    //角色 多对多
    private List<Role> roles = new ArrayList<>();
    //部门 多对一
    private Department department;
    //租户 多对一
    private Long sn;
    private Tenant tenant;
    private List<SystemMenu> menus = new ArrayList<>();

    public List<SystemMenu> getSystemMenus() {
        return menus;
    }

    public void setSystemMenus(List<SystemMenu> menus) {
        this.menus = menus;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getSn() {
        return sn;
    }

    public String getInputTime() {
        return inputTime;
    }

    public void setInputTime(String inputTime) {
        this.inputTime = inputTime;
    }

    public void setSn(Long sn) {
        this.sn = sn;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "username='" + username + '\'' +
                ", realName='" + realName + '\'' +
                ", password='" + password + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", inputTime='" + inputTime + '\'' +
                ", state=" + state +
                ", type=" + type +
                ", roles=" + roles +
                ", department=" + department +
                ", sn=" + sn +
                ", tenant=" + tenant +
                ", menus=" + menus +
                '}';
    }
}
