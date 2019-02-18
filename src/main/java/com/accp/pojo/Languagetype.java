package com.accp.pojo;

public class Languagetype {
    private Integer languageid;

    private String languagename;

    public Integer getLanguageid() {
        return languageid;
    }

    public void setLanguageid(Integer languageid) {
        this.languageid = languageid;
    }

    public String getLanguagename() {
        return languagename;
    }

    public void setLanguagename(String languagename) {
        this.languagename = languagename == null ? null : languagename.trim();
    }
}