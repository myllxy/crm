package cn.itsource.crm.domain;

import cn.itsource.base.domain.BaseDomain;


/**
 * @author myllxy
 * @create 2020-01-06 15:33
 */
public class Customer extends BaseDomain {
    private String name;
    private Integer age;
    private Integer gender;
    private String tel;
    private String email;
    private String qq;
    private String wechat;
    private Employee seller;
    private String job;
    private Integer salaryLevel;
    private SystemDictionaryItem customerSource;
    private String inputUser;
    private String inputTime;
    private String status;
    private String Tenant;


    public Customer() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
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

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }


    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getSalaryLevel() {
        return salaryLevel;
    }

    public void setSalaryLevel(Integer salaryLevel) {
        this.salaryLevel = salaryLevel;
    }

    public SystemDictionaryItem getCustomerSource() {
        return customerSource;
    }

    public void setCustomerSource(SystemDictionaryItem customerSource) {
        System.out.println(customerSource);
        this.customerSource = customerSource;
    }

    public String getInputUser() {
        return inputUser;
    }

    public void setInputUser(String inputUser) {
        this.inputUser = inputUser;
    }

    public String getInputTime() {
        return inputTime;
    }

    public void setInputTime(String inputTime) {
        this.inputTime = inputTime;
    }

    public String getTenant() {
        return Tenant;
    }

    public void setTenant(String tenant) {
        Tenant = tenant;
    }

    public Employee getSeller() {
        return seller;
    }

    public void setSeller(Employee seller) {
        this.seller = seller;
    }

    public Customer(String name, Integer age, Integer gender, String tel, String email, String qq, String wechat, Employee seller, String job, Integer salaryLevel, SystemDictionaryItem customerSource, String inputUser, String inputTime, String status, String tenant) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.tel = tel;
        this.email = email;
        this.qq = qq;
        this.wechat = wechat;
        this.seller = seller;
        this.job = job;
        this.salaryLevel = salaryLevel;
        this.customerSource = customerSource;
        this.inputUser = inputUser;
        this.inputTime = inputTime;
        this.status = status;
        Tenant = tenant;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", qq='" + qq + '\'' +
                ", wechat='" + wechat + '\'' +
                ", seller=" + seller +
                ", job='" + job + '\'' +
                ", salaryLevel=" + salaryLevel +
                ", customerSource=" + customerSource +
                ", inputUser='" + inputUser + '\'' +
                ", inputTime='" + inputTime + '\'' +
                ", status='" + status + '\'' +
                ", Tenant='" + Tenant + '\'' +
                '}';
    }
}
