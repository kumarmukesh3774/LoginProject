package com.userlogin.microservices;

public class LoginBean {
	
	private String username;
	private String password;
	
	
	public LoginBean() {
		super();
	}
	public LoginBean(String username, String password) {
		super();
		this.username = username;
		this.password = password;
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
	@Override
	public String toString() {
		return "LoginBean [username=" + username + ", password=" + password + "]";
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
