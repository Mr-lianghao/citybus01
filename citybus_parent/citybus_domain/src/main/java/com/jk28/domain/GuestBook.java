package com.jk28.domain;

import java.io.Serializable;

public class GuestBook implements Serializable {

	private Integer gid;
	private User user1;
	private String email;
	private String qq;
	private String content1;
	private String addtime;
	private Replay replayer1;
	
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public User getUser1() {
		return user1;
	}
	public void setUser1(User user1) {
		this.user1 = user1;
	}
	
	
	public Replay getReplayer1() {
		return replayer1;
	}
	public void setReplayer1(Replay replayer1) {
		this.replayer1 = replayer1;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getContent1() {
		return content1;
	}
	public void setContent1(String content1) {
		this.content1 = content1;
	}
	public String getAddtime() {
		return addtime;
	}
	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}
	
	
	
	
}
