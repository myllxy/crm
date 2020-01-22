package cn.itsource.crm.domain;

import cn.itsource.base.domain.BaseDomain;

public class SystemDictionaryItem extends BaseDomain {
    //字典明细名称
    private String name;
    //字典明细序号
    private Long requence;
    //字典明细简介
    private String intro;
    //多对一 字典目录
    private SystemDictionary parent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRequence() {
        return requence;
    }

    public void setRequence(Long requence) {
        this.requence = requence;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public SystemDictionary getParent() {
        return parent;
    }

    public void setParent(SystemDictionary parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "SystemDictionaryItem{" +
                "name='" + name + '\'' +
                ", requence=" + requence +
                ", intro='" + intro + '\'' +
                '}';
    }
}
