package com.accp.pojo;

import java.util.Date;

public class Admin {
    private Integer adminid;

    private Integer admintype;

    private String name;

    private String password;

    private Date creationtime;

    private Integer roleid;

    private String creationip;

    private Integer founder;

    private Date recententry;

    private String ip;

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public Integer getAdmintype() {
        return admintype;
    }

    public void setAdmintype(Integer admintype) {
        this.admintype = admintype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getCreationip() {
        return creationip;
    }

    public void setCreationip(String creationip) {
        this.creationip = creationip == null ? null : creationip.trim();
    }

    public Integer getFounder() {
        return founder;
    }

    public void setFounder(Integer founder) {
        this.founder = founder;
    }

    public Date getRecententry() {
        return recententry;
    }

    public void setRecententry(Date recententry) {
        this.recententry = recententry;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }
}