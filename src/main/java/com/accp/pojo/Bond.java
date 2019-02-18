package com.accp.pojo;

import java.util.Date;

public class Bond {
    private Integer bid;

    private Integer userid;

    private Integer bondtype;

    private Float goldcoin;

    private Date submittime;

    private Date completetime;

    private Integer auditstatus;

    private String reviewnotes;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getBondtype() {
        return bondtype;
    }

    public void setBondtype(Integer bondtype) {
        this.bondtype = bondtype;
    }

    public Float getGoldcoin() {
        return goldcoin;
    }

    public void setGoldcoin(Float goldcoin) {
        this.goldcoin = goldcoin;
    }

    public Date getSubmittime() {
        return submittime;
    }

    public void setSubmittime(Date submittime) {
        this.submittime = submittime;
    }

    public Date getCompletetime() {
        return completetime;
    }

    public void setCompletetime(Date completetime) {
        this.completetime = completetime;
    }

    public Integer getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(Integer auditstatus) {
        this.auditstatus = auditstatus;
    }

    public String getReviewnotes() {
        return reviewnotes;
    }

    public void setReviewnotes(String reviewnotes) {
        this.reviewnotes = reviewnotes == null ? null : reviewnotes.trim();
    }
}