package com.myblog.entity;

public class User_info {
	private Integer user_id;
	private String user_name;
	private String user_img;
	private Byte user_sex;
	private String user_signature;
	private String user_info;
	private String user_birthday;
	private String user_location;
	
	public User_info() {
		super();
	}
	public User_info(Integer user_id, String user_name, String user_img, Byte user_sex, String user_signature,
			String user_info, String user_birthday, String user_location) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_img = user_img;
		this.user_sex = user_sex;
		this.user_signature = user_signature;
		this.user_info = user_info;
		this.user_birthday = user_birthday;
		this.user_location = user_location;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_img() {
		return user_img;
	}
	public void setUser_img(String user_img) {
		this.user_img = user_img;
	}
	public Byte getUser_sex() {
		return user_sex;
	}
	public void setUser_sex(Byte user_sex) {
		this.user_sex = user_sex;
	}
	public String getUser_signature() {
		return user_signature;
	}
	public void setUser_signature(String user_signature) {
		this.user_signature = user_signature;
	}
	public String getUser_info() {
		return user_info;
	}
	public void setUser_info(String user_info) {
		this.user_info = user_info;
	}
	public String getUser_birthday() {
		return user_birthday;
	}
	public void setUser_birthday(String user_birthday) {
		this.user_birthday = user_birthday;
	}
	public String getUser_location() {
		return user_location;
	}
	public void setUser_location(String user_location) {
		this.user_location = user_location;
	}
	@Override
	public String toString() {
		return "User_info [user_id=" + user_id + ", user_name=" + user_name + ", user_img=" + user_img + ", user_sex="
				+ user_sex + ", user_signature=" + user_signature + ", user_info=" + user_info + ", user_birthday="
				+ user_birthday + ", user_location=" + user_location + "]";
	}
   
}
