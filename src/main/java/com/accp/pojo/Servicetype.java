package com.accp.pojo;

public class Servicetype {
    private Integer stid;

    private Integer stpid;

    private String stname;

    private Integer sort;

    private Boolean display;

    private Integer operationtime;

    private Integer confirmtime;

    private Integer violatednumber;

    private Integer proportion;

    private Boolean toexamine;

    private String advertisement;

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public Integer getStpid() {
        return stpid;
    }

    public void setStpid(Integer stpid) {
        this.stpid = stpid;
    }

    public String getStname() {
        return stname;
    }

    public void setStname(String stname) {
        this.stname = stname == null ? null : stname.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Boolean getDisplay() {
        return display;
    }

    public void setDisplay(Boolean display) {
        this.display = display;
    }

    public Integer getOperationtime() {
        return operationtime;
    }

    public void setOperationtime(Integer operationtime) {
        this.operationtime = operationtime;
    }

    public Integer getConfirmtime() {
        return confirmtime;
    }

    public void setConfirmtime(Integer confirmtime) {
        this.confirmtime = confirmtime;
    }

    public Integer getViolatednumber() {
        return violatednumber;
    }

    public void setViolatednumber(Integer violatednumber) {
        this.violatednumber = violatednumber;
    }

    public Integer getProportion() {
        return proportion;
    }

    public void setProportion(Integer proportion) {
        this.proportion = proportion;
    }

    public Boolean getToexamine() {
        return toexamine;
    }

    public void setToexamine(Boolean toexamine) {
        this.toexamine = toexamine;
    }

    public String getAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(String advertisement) {
        this.advertisement = advertisement == null ? null : advertisement.trim();
    }
}