package com.jim.mybatis.model.entity;

import org.apache.ibatis.type.Alias;

import java.sql.Timestamp;

/**
 * Created by jim on 2017/8/5.
 * This class is ...
 */
@Alias("User")
public class User {
	private long id;
	private String username;
	private String email;
	private String password;
	private String salt;
	private Timestamp create_at;
	private Timestamp update_at;

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public Timestamp getCreate_at() {
		return this.create_at;
	}

	public void setCreate_at(Timestamp create_at) {
		this.create_at = create_at;
	}

	public Timestamp getUpdate_at() {
		return this.update_at;
	}

	public void setUpdate_at(Timestamp update_at) {
		this.update_at = update_at;
	}
}
