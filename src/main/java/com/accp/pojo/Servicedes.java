package com.accp.pojo;

public class Servicedes {
    private Integer servicedesid;

    private String servicedestitle;

    private String servicedescontentiourl;

    private Integer serviceid;

    public Integer getServicedesid() {
        return servicedesid;
    }

    public void setServicedesid(Integer servicedesid) {
        this.servicedesid = servicedesid;
    }

    public String getServicedestitle() {
        return servicedestitle;
    }

    public void setServicedestitle(String servicedestitle) {
        this.servicedestitle = servicedestitle == null ? null : servicedestitle.trim();
    }

    public String getServicedescontentiourl() {
        return servicedescontentiourl;
    }

    public void setServicedescontentiourl(String servicedescontentiourl) {
        this.servicedescontentiourl = servicedescontentiourl == null ? null : servicedescontentiourl.trim();
    }

    public Integer getServiceid() {
        return serviceid;
    }

    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
    }
}