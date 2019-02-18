package com.accp.pojo;

import java.util.Date;

public class Advertisement {
    private Integer aid;

    private Integer atid;

    private String atitle;

    private Integer aorder;

    private String aimgpath;

    private String apcurl;

    private String aappurl;

    private Boolean state;

    private Date starttime;

    private Integer rentamonth;

    private Float price;

    private String adescribe;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getAtid() {
        return atid;
    }

    public void setAtid(Integer atid) {
        this.atid = atid;
    }

    public String getAtitle() {
        return atitle;
    }

    public void setAtitle(String atitle) {
        this.atitle = atitle == null ? null : atitle.trim();
    }

    public Integer getAorder() {
        return aorder;
    }

    public void setAorder(Integer aorder) {
        this.aorder = aorder;
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

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Integer getRentamonth() {
        return rentamonth;
    }

    public void setRentamonth(Integer rentamonth) {
        this.rentamonth = rentamonth;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getAdescribe() {
        return adescribe;
    }

    public void setAdescribe(String adescribe) {
        this.adescribe = adescribe == null ? null : adescribe.trim();
    }
}