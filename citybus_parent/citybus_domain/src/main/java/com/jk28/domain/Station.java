package com.jk28.domain;

import java.io.Serializable;

public class Station implements Serializable {

	private String sid;
	private String sname;
	private Double pointX;
	private Double pointY;
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Double getPointX() {
		return pointX;
	}
	public void setPointX(Double pointX) {
		this.pointX = pointX;
	}
	public Double getPointY() {
		return pointY;
	}
	public void setPointY(Double pointY) {
		this.pointY = pointY;
	}
	
}
