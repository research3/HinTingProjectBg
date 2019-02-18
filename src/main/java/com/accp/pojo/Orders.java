package com.accp.pojo;

import java.util.Date;

public class Orders {
    private String orderid;

    private Integer userid;

    private Integer serviceid;

    private Integer resouroeid;

    private Integer ordertype;

    private Date ordertime;

    private Date paymenttime;

    private Date receipttime;

    private Date provideservicestime;

    private Date completetime;

    private Date scheduledstarttime;

    private Date scheduledendtime;

    private Integer population;

    private Integer number;

    private Float smallplan;

    private Float totalprice;

    private String uploadpath;

    private Double weight;

    private Integer integral;

    private Integer collectgoods;

    private Integer addressid;

    private Integer orderstatus;

    private Integer commentstatus;

    private Integer refundstatus;

    private Integer filesatus;

    private String documentpath;

    private String remarks;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getServiceid() {
        return serviceid;
    }

    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
    }

    public Integer getResouroeid() {
        return resouroeid;
    }

    public void setResouroeid(Integer resouroeid) {
        this.resouroeid = resouroeid;
    }

    public Integer getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(Integer ordertype) {
        this.ordertype = ordertype;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Date getPaymenttime() {
        return paymenttime;
    }

    public void setPaymenttime(Date paymenttime) {
        this.paymenttime = paymenttime;
    }

    public Date getReceipttime() {
        return receipttime;
    }

    public void setReceipttime(Date receipttime) {
        this.receipttime = receipttime;
    }

    public Date getProvideservicestime() {
        return provideservicestime;
    }

    public void setProvideservicestime(Date provideservicestime) {
        this.provideservicestime = provideservicestime;
    }

    public Date getCompletetime() {
        return completetime;
    }

    public void setCompletetime(Date completetime) {
        this.completetime = completetime;
    }

    public Date getScheduledstarttime() {
        return scheduledstarttime;
    }

    public void setScheduledstarttime(Date scheduledstarttime) {
        this.scheduledstarttime = scheduledstarttime;
    }

    public Date getScheduledendtime() {
        return scheduledendtime;
    }

    public void setScheduledendtime(Date scheduledendtime) {
        this.scheduledendtime = scheduledendtime;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Float getSmallplan() {
        return smallplan;
    }

    public void setSmallplan(Float smallplan) {
        this.smallplan = smallplan;
    }

    public Float getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Float totalprice) {
        this.totalprice = totalprice;
    }

    public String getUploadpath() {
        return uploadpath;
    }

    public void setUploadpath(String uploadpath) {
        this.uploadpath = uploadpath == null ? null : uploadpath.trim();
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Integer getCollectgoods() {
        return collectgoods;
    }

    public void setCollectgoods(Integer collectgoods) {
        this.collectgoods = collectgoods;
    }

    public Integer getAddressid() {
        return addressid;
    }

    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    public Integer getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(Integer orderstatus) {
        this.orderstatus = orderstatus;
    }

    public Integer getCommentstatus() {
        return commentstatus;
    }

    public void setCommentstatus(Integer commentstatus) {
        this.commentstatus = commentstatus;
    }

    public Integer getRefundstatus() {
        return refundstatus;
    }

    public void setRefundstatus(Integer refundstatus) {
        this.refundstatus = refundstatus;
    }

    public Integer getFilesatus() {
        return filesatus;
    }

    public void setFilesatus(Integer filesatus) {
        this.filesatus = filesatus;
    }

    public String getDocumentpath() {
        return documentpath;
    }

    public void setDocumentpath(String documentpath) {
        this.documentpath = documentpath == null ? null : documentpath.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}