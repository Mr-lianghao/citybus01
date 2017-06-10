package com.jk28.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class User implements Serializable {
	private int uid; // 用户编号
	private String username; // 用户姓名
	private String password; // 用户密码
	private String gender; // 用户性别
	private String email; // 用户邮箱
	private String regtime;// 注册时间
	private String lasttime;
	private Integer nums;
	private String user_img;
	
	private Set<GuestBook> gbSet = new HashSet<GuestBook>(0);

	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegtime() {
		return regtime;
	}
	public void setRegtime(String regtime) {
		this.regtime = regtime;
	}
	public String getLasttime() {
		return lasttime;
	}
	public void setLasttime(String lasttime) {
		this.lasttime = lasttime;
	}
	public Integer getNums() {
		return nums;
	}
	public void setNums(Integer nums) {
		this.nums = nums;
	}
	public String getUser_img() {
		return user_img;
	}
	public void setUser_img(String user_img) {
		this.user_img = user_img;
	}
	public Set<GuestBook> getGbSet() {
		return gbSet;
	}
	public void setGbSet(Set<GuestBook> gbSet) {
		this.gbSet = gbSet;
	}
	
}
