package com.accp.pojo;

public class Resouroe {
    private Integer resouroeid;

    private String resouroename;

    public Integer getResouroeid() {
        return resouroeid;
    }

    public void setResouroeid(Integer resouroeid) {
        this.resouroeid = resouroeid;
    }

    public String getResouroename() {
        return resouroename;
    }

    public void setResouroename(String resouroename) {
        this.resouroename = resouroename == null ? null : resouroename.trim();
    }
}