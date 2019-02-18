package com.accp.pojo;

import java.util.Date;

public class Integralrecord {
    private Integer irid;

    private Integer userid;

    private Date irdate;

    private String irdescribe;

    private Integer recordinandout;

    private Integer integralid;

    private Integer auditstatus;

    public Integer getIrid() {
        return irid;
    }

    public void setIrid(Integer irid) {
        this.irid = irid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getIrdate() {
        return irdate;
    }

    public void setIrdate(Date irdate) {
        this.irdate = irdate;
    }

    public String getIrdescribe() {
        return irdescribe;
    }

    public void setIrdescribe(String irdescribe) {
        this.irdescribe = irdescribe == null ? null : irdescribe.trim();
    }

    public Integer getRecordinandout() {
        return recordinandout;
    }

    public void setRecordinandout(Integer recordinandout) {
        this.recordinandout = recordinandout;
    }

    public Integer getIntegralid() {
        return integralid;
    }

    public void setIntegralid(Integer integralid) {
        this.integralid = integralid;
    }

    public Integer getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(Integer auditstatus) {
        this.auditstatus = auditstatus;
    }
}