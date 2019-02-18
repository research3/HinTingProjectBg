package com.accp.pojo;

public class Integral {
    private Integer integralid;

    private Integer viceid;

    private String integralname;

    private Integer require;

    private Integer integral;

    public Integer getIntegralid() {
        return integralid;
    }

    public void setIntegralid(Integer integralid) {
        this.integralid = integralid;
    }

    public Integer getViceid() {
        return viceid;
    }

    public void setViceid(Integer viceid) {
        this.viceid = viceid;
    }

    public String getIntegralname() {
        return integralname;
    }

    public void setIntegralname(String integralname) {
        this.integralname = integralname == null ? null : integralname.trim();
    }

    public Integer getRequire() {
        return require;
    }

    public void setRequire(Integer require) {
        this.require = require;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }
}