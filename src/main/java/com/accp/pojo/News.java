package com.accp.pojo;

import java.util.Date;

public class News {
    private Integer newsid;

    private Integer thesender;

    private Integer addressee;

    private Date sendingtime;

    private Boolean readstate;

    private Integer newstype;

    private Integer messagegroup;

    private String content;

    public Integer getNewsid() {
        return newsid;
    }

    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }

    public Integer getThesender() {
        return thesender;
    }

    public void setThesender(Integer thesender) {
        this.thesender = thesender;
    }

    public Integer getAddressee() {
        return addressee;
    }

    public void setAddressee(Integer addressee) {
        this.addressee = addressee;
    }

    public Date getSendingtime() {
        return sendingtime;
    }

    public void setSendingtime(Date sendingtime) {
        this.sendingtime = sendingtime;
    }

    public Boolean getReadstate() {
        return readstate;
    }

    public void setReadstate(Boolean readstate) {
        this.readstate = readstate;
    }

    public Integer getNewstype() {
        return newstype;
    }

    public void setNewstype(Integer newstype) {
        this.newstype = newstype;
    }

    public Integer getMessagegroup() {
        return messagegroup;
    }

    public void setMessagegroup(Integer messagegroup) {
        this.messagegroup = messagegroup;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}