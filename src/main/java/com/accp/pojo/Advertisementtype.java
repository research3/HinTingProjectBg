package com.accp.pojo;

public class Advertisementtype {
    private Integer atid;

    private String atname;

    private String atpx;

    public Integer getAtid() {
        return atid;
    }

    public void setAtid(Integer atid) {
        this.atid = atid;
    }

    public String getAtname() {
        return atname;
    }

    public void setAtname(String atname) {
        this.atname = atname == null ? null : atname.trim();
    }

    public String getAtpx() {
        return atpx;
    }

    public void setAtpx(String atpx) {
        this.atpx = atpx == null ? null : atpx.trim();
    }
}