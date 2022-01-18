package com.shop.vo;

import java.util.Date;

public class CouponVO {
	private int seq;
	private int holder;
	private String couponId;
	private String couponName;
	private double dcRate;	//0.x
	private String validate;
	private Date useDate;
	private Date expiryDate;
	private String img;
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getHolder() {
		return holder;
	}
	public void setHolder(int holder) {
		this.holder = holder;
	}
	public String getCouponId() {
		return couponId;
	}
	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}
	public String getCouponName() {
		return couponName;
	}
	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}
	public double getDcRate() {
		return dcRate;
	}
	public void setDcRate(double dcRate) {
		this.dcRate = dcRate;
	}
	public String getValidate() {
		return validate;
	}
	public void setValidate(String validate) {
		this.validate = validate;
	}
	public Date getUseDate() {
		return useDate;
	}
	public void setUseDate(Date useDate) {
		this.useDate = useDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "CouponVO [seq=" + seq + ", holder=" + holder + ", couponId=" + couponId + ", couponName=" + couponName
				+ ", dcRate=" + dcRate + ", validate=" + validate + ", useDate=" + useDate + ", expiryDate="
				+ expiryDate + ", img=" + img + "]";
	}
	
	
}
