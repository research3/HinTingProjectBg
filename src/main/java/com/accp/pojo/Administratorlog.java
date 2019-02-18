package com.accp.pojo;

import java.util.Date;

public class Administratorlog {
    private Integer adminlogid;

    private Integer adminid;

    private Date remarkstime;

    private String remarksip;

    private String remarks;

    public Integer getAdminlogid() {
        return adminlogid;
    }

    public void setAdminlogid(Integer adminlogid) {
        this.adminlogid = adminlogid;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public Date getRemarkstime() {
        return remarkstime;
    }

    public void setRemarkstime(Date remarkstime) {
        this.remarkstime = remarkstime;
    }

    public String getRemarksip() {
        return remarksip;
    }

    public void setRemarksip(String remarksip) {
        this.remarksip = remarksip == null ? null : remarksip.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}