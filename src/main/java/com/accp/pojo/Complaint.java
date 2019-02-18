package com.accp.pojo;

import java.util.Date;

public class Complaint {
    private Integer cid;

    private Integer posting;

    private Integer pcid;

    private Integer userid;

    private Integer ctid;

    private Date timeofcomplaint;

    private Integer auditstatus;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getPosting() {
        return posting;
    }

    public void setPosting(Integer posting) {
        this.posting = posting;
    }

    public Integer getPcid() {
        return pcid;
    }

    public void setPcid(Integer pcid) {
        this.pcid = pcid;
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

    public Integer getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(Integer auditstatus) {
        this.auditstatus = auditstatus;
    }
}