package com.accp.pojo;

import java.util.Date;

public class Servicereporting {
    private Integer srid;

    private Integer businessid;

    private Integer serviceid;

    private Integer userid;

    private Integer ctid;

    private Date timeofcomplaint;

    private Date audittime;

    private Integer auditstatus;

    public Integer getSrid() {
        return srid;
    }

    public void setSrid(Integer srid) {
        this.srid = srid;
    }

    public Integer getBusinessid() {
        return businessid;
    }

    public void setBusinessid(Integer businessid) {
        this.businessid = businessid;
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

    public Integer getCtid() {
        return ctid;
    }

    public void setCtid(Integer ctid) {
        this.ctid = ctid;
    }

    public Date getTimeofcomplaint() {
        return timeofcomplaint;
    }

    public void setTimeofcomplaint(Date timeofcomplaint) {
        this.timeofcomplaint = timeofcomplaint;
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