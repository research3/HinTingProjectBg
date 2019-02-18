package com.accp.pojo;

import java.util.Date;

public class Refund {
	private Integer refundid;

	private Integer point;

	private String orderid;

	private Integer userid;

	private String refundimg;

	private Float applyrefundmoney;

	private Float actualrefundmoney;

	private Date applicationtime;

	private Date audittime;

	private Integer auditstatus;

	private Date admintime;

	private Integer adminstatus;

	private String refundreason;

	private String refundexplain;

	private String businessremarks;

	private String adminremarks;

	public String getRefundreason() {
		return refundreason;
	}

	public void setRefundreason(String refundreason) {
		this.refundreason = refundreason == null ? null : refundreason.trim();
	}

	public String getRefundexplain() {
		return refundexplain;
	}

	public void setRefundexplain(String refundexplain) {
		this.refundexplain = refundexplain == null ? null : refundexplain.trim();
	}

	public String getBusinessremarks() {
		return businessremarks;
	}

	public void setBusinessremarks(String businessremarks) {
		this.businessremarks = businessremarks == null ? null : businessremarks.trim();
	}

	public String getAdminremarks() {
		return adminremarks;
	}

	public void setAdminremarks(String adminremarks) {
		this.adminremarks = adminremarks == null ? null : adminremarks.trim();
	}

	public Integer getRefundid() {
		return refundid;
	}

	public void setRefundid(Integer refundid) {
		this.refundid = refundid;
	}

	public Integer getPoint() {
		return point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

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

	public String getRefundimg() {
		return refundimg;
	}

	public void setRefundimg(String refundimg) {
		this.refundimg = refundimg == null ? null : refundimg.trim();
	}

	public Float getApplyrefundmoney() {
		return applyrefundmoney;
	}

	public void setApplyrefundmoney(Float applyrefundmoney) {
		this.applyrefundmoney = applyrefundmoney;
	}

	public Float getActualrefundmoney() {
		return actualrefundmoney;
	}

	public void setActualrefundmoney(Float actualrefundmoney) {
		this.actualrefundmoney = actualrefundmoney;
	}

	public Date getApplicationtime() {
		return applicationtime;
	}

	public void setApplicationtime(Date applicationtime) {
		this.applicationtime = applicationtime;
	}

	public Date getAudittime() {
		return audittime;
	}

	public void setAudittime(Date audittime) {
		this.audittime = audittime;
	}

	public Integer getAuditstatus() {
		return auditstatus;
	}

	public void setAuditstatus(Integer auditstatus) {
		this.auditstatus = auditstatus;
	}

	public Date getAdmintime() {
		return admintime;
	}

	public void setAdmintime(Date admintime) {
		this.admintime = admintime;
	}

	public Integer getAdminstatus() {
		return adminstatus;
	}

	public void setAdminstatus(Integer adminstatus) {
		this.adminstatus = adminstatus;
	}
}