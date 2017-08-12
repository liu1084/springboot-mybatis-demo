package com.jim.mybatis.model.entity;

/**
 * Created by jim on 2017/8/5.
 * This class is ...
 */
public class User extends Base {
	private String username;
	private String email;
	private String password;
	private String salt;

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return this.salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

}
