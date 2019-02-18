package com.accp.pojo;

import java.util.Date;

public class Browserecords {
    private Integer brid;

    private Integer brtype;

    private Integer userid;

    private Integer postid;

    private Integer serviceid;

    private Date browsetime;

    public Integer getBrid() {
        return brid;
    }

    public void setBrid(Integer brid) {
        this.brid = brid;
    }

    public Integer getBrtype() {
        return brtype;
    }

    public void setBrtype(Integer brtype) {
        this.brtype = brtype;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public Integer getServiceid() {
        return serviceid;
    }

    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
    }

    public Date getBrowsetime() {
        return browsetime;
    }

    public void setBrowsetime(Date browsetime) {
        this.browsetime = browsetime;
    }
}