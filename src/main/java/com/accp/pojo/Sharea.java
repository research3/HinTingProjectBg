package com.accp.pojo;

public class Sharea {
    private Integer areaid;

    private Integer pid;

    private String name;

    private String mergername;

    private Integer level;

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMergername() {
        return mergername;
    }

    public void setMergername(String mergername) {
        this.mergername = mergername == null ? null : mergername.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}