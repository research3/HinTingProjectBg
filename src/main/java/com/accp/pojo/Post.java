package com.accp.pojo;

import java.util.Date;

public class Post {
	private Integer postid;

	private Integer userid;

	private Integer browsenumber;

	private Integer commentnumber;

	private Integer fabulousnumber;

	private Integer collectionnumber;

	private Integer fmid;

	private String title;

	private Date releasetime;

	private Integer operatingstate;

	private Boolean essence;

	private Boolean solid;

	private Integer majorid;

	private String resourcespath;

	private String servicecosttypeid;

	private Integer integral;

	private Integer goldcoin;

	private String videopath;

	private String coverpath;

	private String time;

	private Integer auditstatus;

	private String content;

	private String adminopinion;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}

	public String getAdminopinion() {
		return adminopinion;
	}

	public void setAdminopinion(String adminopinion) {
		this.adminopinion = adminopinion == null ? null : adminopinion.trim();
	}

	public Integer getPostid() {
		return postid;
	}

	public void setPostid(Integer postid) {
		this.postid = postid;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getBrowsenumber() {
		return browsenumber;
	}

	public void setBrowsenumber(Integer browsenumber) {
		this.browsenumber = browsenumber;
	}

	public Integer getCommentnumber() {
		return commentnumber;
	}

	public void setCommentnumber(Integer commentnumber) {
		this.commentnumber = commentnumber;
	}

	public Integer getFabulousnumber() {
		return fabulousnumber;
	}

	public void setFabulousnumber(Integer fabulousnumber) {
		this.fabulousnumber = fabulousnumber;
	}

	public Integer getCollectionnumber() {
		return collectionnumber;
	}

	public void setCollectionnumber(Integer collectionnumber) {
		this.collectionnumber = collectionnumber;
	}

	public Integer getFmid() {
		return fmid;
	}

	public void setFmid(Integer fmid) {
		this.fmid = fmid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	public Date getReleasetime() {
		return releasetime;
	}

	public void setReleasetime(Date releasetime) {
		this.releasetime = releasetime;
	}

	public Integer getOperatingstate() {
		return operatingstate;
	}

	public void setOperatingstate(Integer operatingstate) {
		this.operatingstate = operatingstate;
	}

	public Boolean getEssence() {
		return essence;
	}

	public void setEssence(Boolean essence) {
		this.essence = essence;
	}

	public Boolean getSolid() {
		return solid;
	}

	public void setSolid(Boolean solid) {
		this.solid = solid;
	}

	public Integer getMajorid() {
		return majorid;
	}

	public void setMajorid(Integer majorid) {
		this.majorid = majorid;
	}

	public String getResourcespath() {
		return resourcespath;
	}

	public void setResourcespath(String resourcespath) {
		this.resourcespath = resourcespath == null ? null : resourcespath.trim();
	}

	public String getServicecosttypeid() {
		return servicecosttypeid;
	}

	public void setServicecosttypeid(String servicecosttypeid) {
		this.servicecosttypeid = servicecosttypeid == null ? null : servicecosttypeid.trim();
	}

	public Integer getIntegral() {
		return integral;
	}

	public void setIntegral(Integer integral) {
		this.integral = integral;
	}

	public Integer getGoldcoin() {
		return goldcoin;
	}

	public void setGoldcoin(Integer goldcoin) {
		this.goldcoin = goldcoin;
	}

	public String getVideopath() {
		return videopath;
	}

	public void setVideopath(String videopath) {
		this.videopath = videopath == null ? null : videopath.trim();
	}

	public String getCoverpath() {
		return coverpath;
	}

	public void setCoverpath(String coverpath) {
		this.coverpath = coverpath == null ? null : coverpath.trim();
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time == null ? null : time.trim();
	}

	public Integer getAuditstatus() {
		return auditstatus;
	}

	public void setAuditstatus(Integer auditstatus) {
		this.auditstatus = auditstatus;
	}
}