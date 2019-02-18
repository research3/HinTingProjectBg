package com.accp.pojo;

import java.util.Date;

public class Merchantcollection {
    private Integer collectid;

    private Integer userid;

    private Integer merchantorservicebyid;

    private Integer collecttype;

    private Date collectiontime;

    public Integer getCollectid() {
        return collectid;
    }

    public void setCollectid(Integer collectid) {
        this.collectid = collectid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getMerchantorservicebyid() {
        return merchantorservicebyid;
    }

    public void setMerchantorservicebyid(Integer merchantorservicebyid) {
        this.merchantorservicebyid = merchantorservicebyid;
    }

    public Integer getCollecttype() {
        return collecttype;
    }

    public void setCollecttype(Integer collecttype) {
        this.collecttype = collecttype;
    }

    public Date getCollectiontime() {
        return collectiontime;
    }

    public void setCollectiontime(Date collectiontime) {
        this.collectiontime = collectiontime;
    }
}