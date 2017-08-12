package com.jim.mybatis.model.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by jim on 2017/8/13.
 * This class is ...
 */
public class Base implements Serializable {

	private long id;
	private Timestamp createAt;
	private Timestamp updateAt;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Timestamp getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Timestamp createAt) {
		this.createAt = createAt;
	}

	public Timestamp getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Timestamp updateAt) {
		this.updateAt = updateAt;
	}
}
