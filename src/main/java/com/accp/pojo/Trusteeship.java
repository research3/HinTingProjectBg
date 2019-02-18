package com.accp.pojo;

import java.util.Date;

public class Trusteeship {
    private Integer truid;

    private Integer userid;

    private Date applicationtime;

    private Integer trusteeshipmonth;

    private Date audittime;

    private Integer auditstatus;

    public Integer getTruid() {
        return truid;
    }

    public void setTruid(Integer truid) {
        this.truid = truid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getApplicationtime() {
        return applicationtime;
    }

    public void setApplicationtime(Date applicationtime) {
        this.applicationtime = applicationtime;
    }

    public Integer getTrusteeshipmonth() {
        return trusteeshipmonth;
    }

    public void setTrusteeshipmonth(Integer trusteeshipmonth) {
        this.trusteeshipmonth = trusteeshipmonth;
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