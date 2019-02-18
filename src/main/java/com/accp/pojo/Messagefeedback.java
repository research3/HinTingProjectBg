package com.accp.pojo;

import java.util.Date;

public class Messagefeedback {
    private Integer mfid;

    private String mfname;

    private String mfphone;

    private String mfemail;

    private String mfcontent;

    private String mfjointheway;

    private Date mfdate;

    public Integer getMfid() {
        return mfid;
    }

    public void setMfid(Integer mfid) {
        this.mfid = mfid;
    }

    public String getMfname() {
        return mfname;
    }

    public void setMfname(String mfname) {
        this.mfname = mfname == null ? null : mfname.trim();
    }

    public String getMfphone() {
        return mfphone;
    }

    public void setMfphone(String mfphone) {
        this.mfphone = mfphone == null ? null : mfphone.trim();
    }

    public String getMfemail() {
        return mfemail;
    }

    public void setMfemail(String mfemail) {
        this.mfemail = mfemail == null ? null : mfemail.trim();
    }

    public String getMfcontent() {
        return mfcontent;
    }

    public void setMfcontent(String mfcontent) {
        this.mfcontent = mfcontent == null ? null : mfcontent.trim();
    }

    public String getMfjointheway() {
        return mfjointheway;
    }

    public void setMfjointheway(String mfjointheway) {
        this.mfjointheway = mfjointheway == null ? null : mfjointheway.trim();
    }

    public Date getMfdate() {
        return mfdate;
    }

    public void setMfdate(Date mfdate) {
        this.mfdate = mfdate;
    }
}