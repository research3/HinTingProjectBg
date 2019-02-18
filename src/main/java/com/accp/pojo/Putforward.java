package com.accp.pojo;

import java.util.Date;

public class Putforward {
    private Integer pfid;

    private Integer userid;

    private String putname;

    private Integer bankid;

    private String bankaccount;

    private String openbankname;

    private Date submittime;

    private Date audittime;

    private Float money;

    private Integer auditstatus;

    public Integer getPfid() {
        return pfid;
    }

    public void setPfid(Integer pfid) {
        this.pfid = pfid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getPutname() {
        return putname;
    }

    public void setPutname(String putname) {
        this.putname = putname == null ? null : putname.trim();
    }

    public Integer getBankid() {
        return bankid;
    }

    public void setBankid(Integer bankid) {
        this.bankid = bankid;
    }

    public String getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount == null ? null : bankaccount.trim();
    }

    public String getOpenbankname() {
        return openbankname;
    }

    public void setOpenbankname(String openbankname) {
        this.openbankname = openbankname == null ? null : openbankname.trim();
    }

    public Date getSubmittime() {
        return submittime;
    }

    public void setSubmittime(Date submittime) {
        this.submittime = submittime;
    }

    public Date getAudittime() {
        return audittime;
    }

    public void setAudittime(Date audittime) {
        this.audittime = audittime;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public Integer getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(Integer auditstatus) {
        this.auditstatus = auditstatus;
    }
}