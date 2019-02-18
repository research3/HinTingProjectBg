package com.accp.pojo;

import java.util.Date;

public class Evaluationservice {
    private Integer serviceappraiseid;

    private Integer serviceid;

    private Integer userid;

    private String serviceappraisecontent;

    private Date serviceappraisedate;

    private Integer serviceappraiselevel;

    private Integer serviceappraisepid;

    public Integer getServiceappraiseid() {
        return serviceappraiseid;
    }

    public void setServiceappraiseid(Integer serviceappraiseid) {
        this.serviceappraiseid = serviceappraiseid;
    }

    public Integer getServiceid() {
        return serviceid;
    }

    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getServiceappraisecontent() {
        return serviceappraisecontent;
    }

    public void setServiceappraisecontent(String serviceappraisecontent) {
        this.serviceappraisecontent = serviceappraisecontent == null ? null : serviceappraisecontent.trim();
    }

    public Date getServiceappraisedate() {
        return serviceappraisedate;
    }

    public void setServiceappraisedate(Date serviceappraisedate) {
        this.serviceappraisedate = serviceappraisedate;
    }

    public Integer getServiceappraiselevel() {
        return serviceappraiselevel;
    }

    public void setServiceappraiselevel(Integer serviceappraiselevel) {
        this.serviceappraiselevel = serviceappraiselevel;
    }

    public Integer getServiceappraisepid() {
        return serviceappraisepid;
    }

    public void setServiceappraisepid(Integer serviceappraisepid) {
        this.serviceappraisepid = serviceappraisepid;
    }
}