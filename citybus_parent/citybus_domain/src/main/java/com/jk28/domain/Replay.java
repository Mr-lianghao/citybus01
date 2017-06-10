package com.jk28.domain;

import java.io.Serializable;

public class Replay implements Serializable {

	private int rid;
	private String replaycontent;
	private String replaytime;
	private String replayer;
	private String username;
	
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getReplaycontent() {
		return replaycontent;
	}
	public void setReplaycontent(String replaycontent) {
		this.replaycontent = replaycontent;
	}
	public String getReplaytime() {
		return replaytime;
	}
	public void setReplaytime(String replaytime) {
		this.replaytime = replaytime;
	}
	public String getReplayer() {
		return replayer;
	}
	public void setReplayer(String replayer) {
		this.replayer = replayer;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
