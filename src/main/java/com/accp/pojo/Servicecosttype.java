package com.accp.pojo;

public class Servicecosttype {
    private Integer servicecosttypeid;

    private String servicecosttypename;

    private Integer stid;

    public Integer getServicecosttypeid() {
        return servicecosttypeid;
    }

    public void setServicecosttypeid(Integer servicecosttypeid) {
        this.servicecosttypeid = servicecosttypeid;
    }

    public String getServicecosttypename() {
        return servicecosttypename;
    }

    public void setServicecosttypename(String servicecosttypename) {
        this.servicecosttypename = servicecosttypename == null ? null : servicecosttypename.trim();
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }
}