package cn.itsource.crm.domain;

import cn.itsource.base.domain.BaseDomain;

import java.util.List;

public class SystemDictionary extends BaseDomain {
    //字典目录编号
    private String sn;
    //字典目录名称
    private String name;
    //字典目录简介
    private String intro;
    //状态
    private String state;
    //字典明细 一对多
    private List<SystemDictionaryItem> details;

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

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    public List<SystemDictionaryItem> getDetails() {
        return details;
    }

    public void setDetails(List<SystemDictionaryItem> details) {
        this.details = details;
    }

    public SystemDictionary() {
    }

    @Override
    public String toString() {
        return "SystemDictionary{" +
                "sn='" + sn + '\'' +
                ", name='" + name + '\'' +
                ", intro='" + intro + '\'' +
                ", state='" + state + '\'' +
                ", details=" + details +
                '}';
    }

    public SystemDictionary(String sn, String name, String intro, String state, List<SystemDictionaryItem> details) {

        this.sn = sn;
        this.name = name;
        this.intro = intro;
        this.state = state;
        this.details = details;
    }
}
