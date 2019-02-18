package com.accp.pojo;

public class Servicelevel {
    private Integer serlevelid;

    private String serlevelname;

    private Integer stid;

    private Integer serviceintegralmin;

    private Integer serviceintegralmax;

    public Integer getSerlevelid() {
        return serlevelid;
    }

    public void setSerlevelid(Integer serlevelid) {
        this.serlevelid = serlevelid;
    }

    public String getSerlevelname() {
        return serlevelname;
    }

    public void setSerlevelname(String serlevelname) {
        this.serlevelname = serlevelname == null ? null : serlevelname.trim();
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public Integer getServiceintegralmin() {
        return serviceintegralmin;
    }

    public void setServiceintegralmin(Integer serviceintegralmin) {
        this.serviceintegralmin = serviceintegralmin;
    }

    public Integer getServiceintegralmax() {
        return serviceintegralmax;
    }

    public void setServiceintegralmax(Integer serviceintegralmax) {
        this.serviceintegralmax = serviceintegralmax;
    }
}