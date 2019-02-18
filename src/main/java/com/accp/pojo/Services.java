package com.accp.pojo;

import java.util.Date;

public class Services {
    private Integer serviceid;

    private Integer stid;

    private Integer userid;

    private Integer resourceid;

    private String servicetitle;

    private String servicefutitle;

    private String downloadtitle;

    private Integer serviceprice;

    private String servicecoverimg;

    private String serviceimgurlone;

    private String serviceimgurltwo;

    private String serviceimgurlthree;

    private String serviceimgurlfour;

    private String servicecosttypeid;

    private String serviceintro;

    private String servicecity;

    private Integer country;

    private String servicecostinclude;

    private Date servicestartdate;

    private Date serviceenddate;

    private String schoolregion;

    private String schoolnamebycn;

    private String majoynamebycn;

    private String schoolnamebyrok;

    private String majoynamebyrok;

    private String goodatmajoy;

    private String hospitalname;

    private Integer servicehour;

    private String uploaddataurl;

    private Date releasetime;

    private Integer browsenumber;

    private Float weight;

    private Boolean recommendbool;

    private Integer shelfstate;

    private Integer auditstatus;

    private String adminopinion;

    public Integer getServiceid() {
        return serviceid;
    }

    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getResourceid() {
        return resourceid;
    }

    public void setResourceid(Integer resourceid) {
        this.resourceid = resourceid;
    }

    public String getServicetitle() {
        return servicetitle;
    }

    public void setServicetitle(String servicetitle) {
        this.servicetitle = servicetitle == null ? null : servicetitle.trim();
    }

    public String getServicefutitle() {
        return servicefutitle;
    }

    public void setServicefutitle(String servicefutitle) {
        this.servicefutitle = servicefutitle == null ? null : servicefutitle.trim();
    }

    public String getDownloadtitle() {
        return downloadtitle;
    }

    public void setDownloadtitle(String downloadtitle) {
        this.downloadtitle = downloadtitle == null ? null : downloadtitle.trim();
    }

    public Integer getServiceprice() {
        return serviceprice;
    }

    public void setServiceprice(Integer serviceprice) {
        this.serviceprice = serviceprice;
    }

    public String getServicecoverimg() {
        return servicecoverimg;
    }

    public void setServicecoverimg(String servicecoverimg) {
        this.servicecoverimg = servicecoverimg == null ? null : servicecoverimg.trim();
    }

    public String getServiceimgurlone() {
        return serviceimgurlone;
    }

    public void setServiceimgurlone(String serviceimgurlone) {
        this.serviceimgurlone = serviceimgurlone == null ? null : serviceimgurlone.trim();
    }

    public String getServiceimgurltwo() {
        return serviceimgurltwo;
    }

    public void setServiceimgurltwo(String serviceimgurltwo) {
        this.serviceimgurltwo = serviceimgurltwo == null ? null : serviceimgurltwo.trim();
    }

    public String getServiceimgurlthree() {
        return serviceimgurlthree;
    }

    public void setServiceimgurlthree(String serviceimgurlthree) {
        this.serviceimgurlthree = serviceimgurlthree == null ? null : serviceimgurlthree.trim();
    }

    public String getServiceimgurlfour() {
        return serviceimgurlfour;
    }

    public void setServiceimgurlfour(String serviceimgurlfour) {
        this.serviceimgurlfour = serviceimgurlfour == null ? null : serviceimgurlfour.trim();
    }

    public String getServicecosttypeid() {
        return servicecosttypeid;
    }

    public void setServicecosttypeid(String servicecosttypeid) {
        this.servicecosttypeid = servicecosttypeid == null ? null : servicecosttypeid.trim();
    }

    public String getServiceintro() {
        return serviceintro;
    }

    public void setServiceintro(String serviceintro) {
        this.serviceintro = serviceintro == null ? null : serviceintro.trim();
    }

    public String getServicecity() {
        return servicecity;
    }

    public void setServicecity(String servicecity) {
        this.servicecity = servicecity == null ? null : servicecity.trim();
    }

    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }

    public String getServicecostinclude() {
        return servicecostinclude;
    }

    public void setServicecostinclude(String servicecostinclude) {
        this.servicecostinclude = servicecostinclude == null ? null : servicecostinclude.trim();
    }

    public Date getServicestartdate() {
        return servicestartdate;
    }

    public void setServicestartdate(Date servicestartdate) {
        this.servicestartdate = servicestartdate;
    }

    public Date getServiceenddate() {
        return serviceenddate;
    }

    public void setServiceenddate(Date serviceenddate) {
        this.serviceenddate = serviceenddate;
    }

    public String getSchoolregion() {
        return schoolregion;
    }

    public void setSchoolregion(String schoolregion) {
        this.schoolregion = schoolregion == null ? null : schoolregion.trim();
    }

    public String getSchoolnamebycn() {
        return schoolnamebycn;
    }

    public void setSchoolnamebycn(String schoolnamebycn) {
        this.schoolnamebycn = schoolnamebycn == null ? null : schoolnamebycn.trim();
    }

    public String getMajoynamebycn() {
        return majoynamebycn;
    }

    public void setMajoynamebycn(String majoynamebycn) {
        this.majoynamebycn = majoynamebycn == null ? null : majoynamebycn.trim();
    }

    public String getSchoolnamebyrok() {
        return schoolnamebyrok;
    }

    public void setSchoolnamebyrok(String schoolnamebyrok) {
        this.schoolnamebyrok = schoolnamebyrok == null ? null : schoolnamebyrok.trim();
    }

    public String getMajoynamebyrok() {
        return majoynamebyrok;
    }

    public void setMajoynamebyrok(String majoynamebyrok) {
        this.majoynamebyrok = majoynamebyrok == null ? null : majoynamebyrok.trim();
    }

    public String getGoodatmajoy() {
        return goodatmajoy;
    }

    public void setGoodatmajoy(String goodatmajoy) {
        this.goodatmajoy = goodatmajoy == null ? null : goodatmajoy.trim();
    }

    public String getHospitalname() {
        return hospitalname;
    }

    public void setHospitalname(String hospitalname) {
        this.hospitalname = hospitalname == null ? null : hospitalname.trim();
    }

    public Integer getServicehour() {
        return servicehour;
    }

    public void setServicehour(Integer servicehour) {
        this.servicehour = servicehour;
    }

    public String getUploaddataurl() {
        return uploaddataurl;
    }

    public void setUploaddataurl(String uploaddataurl) {
        this.uploaddataurl = uploaddataurl == null ? null : uploaddataurl.trim();
    }

    public Date getReleasetime() {
        return releasetime;
    }

    public void setReleasetime(Date releasetime) {
        this.releasetime = releasetime;
    }

    public Integer getBrowsenumber() {
        return browsenumber;
    }

    public void setBrowsenumber(Integer browsenumber) {
        this.browsenumber = browsenumber;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Boolean getRecommendbool() {
        return recommendbool;
    }

    public void setRecommendbool(Boolean recommendbool) {
        this.recommendbool = recommendbool;
    }

    public Integer getShelfstate() {
        return shelfstate;
    }

    public void setShelfstate(Integer shelfstate) {
        this.shelfstate = shelfstate;
    }

    public Integer getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(Integer auditstatus) {
        this.auditstatus = auditstatus;
    }

    public String getAdminopinion() {
        return adminopinion;
    }

    public void setAdminopinion(String adminopinion) {
        this.adminopinion = adminopinion == null ? null : adminopinion.trim();
    }
}