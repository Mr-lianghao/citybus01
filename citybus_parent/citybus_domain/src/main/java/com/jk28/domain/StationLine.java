package com.jk28.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class StationLine implements Serializable {

	private String id;
	private Line line;
	private Station station ;
	private Integer orde;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public Line getLine() {
		return line;
	}
	public void setLine(Line line) {
		this.line = line;
	}
	
	
	public Station getStation() {
		return station;
	}
	public void setStation(Station station) {
		this.station = station;
	}
	public Integer getOrde() {
		return orde;
	}
	public void setOrde(Integer orde) {
		this.orde = orde;
	}
	
	
}
