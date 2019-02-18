package com.accp.pojo;

import java.util.Date;

public class Servicecollection {
    private Integer sercolleid;

    private Integer serviceid;

    private Integer userid;

    private Date collectiontime;

    public Integer getSercolleid() {
        return sercolleid;
    }

    public void setSercolleid(Integer sercolleid) {
        this.sercolleid = sercolleid;
    }

    public Integer getServiceid() {
        return serviceid;
    }

    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getCollectiontime() {
        return collectiontime;
    }

    public void setCollectiontime(Date collectiontime) {
        this.collectiontime = collectiontime;
    }
}