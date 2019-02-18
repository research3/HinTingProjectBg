package com.accp.pojo;

import java.util.Date;

public class Advertisementapply {
    private Integer aaid;

    private Integer userid;

    private Integer aid;

    private String aimgpath;

    private String apcurl;

    private String aappurl;

    private Float price;

    private Integer rentamonth;

    private Date starttime;

    private Date endtime;

    private Date applytime;

    private Date audittime;

    private Integer auditstatus;

    public Integer getAaid() {
        return aaid;
    }

    public void setAaid(Integer aaid) {
        this.aaid = aaid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAimgpath() {
        return aimgpath;
    }

    public void setAimgpath(String aimgpath) {
        this.aimgpath = aimgpath == null ? null : aimgpath.trim();
    }

    public String getApcurl() {
        return apcurl;
    }

    public void setApcurl(String apcurl) {
        this.apcurl = apcurl == null ? null : apcurl.trim();
    }

    public String getAappurl() {
        return aappurl;
    }

    public void setAappurl(String aappurl) {
        this.aappurl = aappurl == null ? null : aappurl.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getRentamonth() {
        return rentamonth;
    }

    public void setRentamonth(Integer rentamonth) {
        this.rentamonth = rentamonth;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getApplytime() {
        return applytime;
    }

    public void setApplytime(Date applytime) {
        this.applytime = applytime;
    }

    public Date getAudittime() {
        return audittime;
    }

    public void setAudittime(Date audittime) {
        this.audittime = audittime;
    }

    public Integer getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(Integer auditstatus) {
        this.auditstatus = auditstatus;
    }
}