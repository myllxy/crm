package cn.itsource.crm.domain;

import cn.itsource.base.domain.BaseDomain;


public class SystemMenu extends BaseDomain {
    private Long sn;
    private String name;
    private String icon;
    private String url;
    private String intro;
    private SystemMenu parent;


    public Long getSn() {
        return sn;
    }

    public void setSn(Long sn) {
        this.sn = sn;
    }

    public SystemMenu() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public SystemMenu getParent() {
        return parent;
    }

    public void setParent(SystemMenu parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "SystemMenu{" +
                "sn=" + sn +
                ", name='" + name + '\'' +
                ", icon='" + icon + '\'' +
                ", url='" + url + '\'' +
                ", intro='" + intro + '\'' +
                '}';
    }
}
