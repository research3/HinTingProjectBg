package com.accp.pojo;

import java.util.Date;

public class Postcomment {
    private Integer pcid;

    private Integer postid;

    private Integer commentator;

    private Integer pid;

    private Date reviewtime;

    private Integer operatingstate;

    private String content;

    public Integer getPcid() {
        return pcid;
    }

    public void setPcid(Integer pcid) {
        this.pcid = pcid;
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public Integer getCommentator() {
        return commentator;
    }

    public void setCommentator(Integer commentator) {
        this.commentator = commentator;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Date getReviewtime() {
        return reviewtime;
    }

    public void setReviewtime(Date reviewtime) {
        this.reviewtime = reviewtime;
    }

    public Integer getOperatingstate() {
        return operatingstate;
    }

    public void setOperatingstate(Integer operatingstate) {
        this.operatingstate = operatingstate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}