package com.shop.vo;

import java.util.Date;

public class ProductVO {
	private int seq;
	private String proId;
	private String proName;
	private int price;
	private int cnt;
	private String img;
	private Date regDate;
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getproId() {
		return proId;
	}
	public void setproId(String proId) {
		this.proId = proId;
	}
	public String getProname() {
		return proName;
	}
	public void setProname(String proName) {
		this.proName = proName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Date getRegdate() {
		return regDate;
	}
	public void setRegdate(Date regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "ProductVO [seq=" + seq + ", proId=" + proId + ", proName=" + proName + ", price=" + price + ", cnt="
				+ cnt + ", img=" + img + ", regDate=" + regDate + "]";
	}
	
}
