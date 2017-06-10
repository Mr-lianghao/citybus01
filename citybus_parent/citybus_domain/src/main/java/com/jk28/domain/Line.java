package com.jk28.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Line implements Serializable {

	private String lid;
	private String lname;
	private String type;
	private String company;
	private String people;
	private Integer tel;
	private String img_url;
	
	private Set<StationLine> stationline = new HashSet<StationLine>(0);
	private String lineString;
	
	public String getLineString() {
		return lineString;
	}
	public void setLineString(String lineString) {
		this.lineString = lineString;
	}
	public String getLid() {
		return lid;
	}
	public void setLid(String lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPeople() {
		return people;
	}
	public void setPeople(String people) {
		this.people = people;
	}
	public Integer getTel() {
		return tel;
	}
	public void setTel(Integer tel) {
		this.tel = tel;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	public Set<StationLine> getStationline() {
		return stationline;
	}
	public void setStationline(Set<StationLine> stationline) {
		this.stationline = stationline;
	}
	
	
}
