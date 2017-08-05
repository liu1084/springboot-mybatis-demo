package com.jim.mybatis.model.entity;

import java.io.Serializable;

/**
 * Created by jim on 2017/8/5.
 * This class is ...
 */
public class Book implements Serializable {
	private static final long serialVersionUID = 1L;

	private long id;

	private String name = "";

	private String description;

	private String cover = "";

	private String author = "";

	private String isbn = "";

	private String year = "";

	private int pages = 0;

	private String language = "english";

	private float size = 0f;

	private String format = "pdf";

	private long category = 0;

	private byte rating = 0;

	private Integer column;

}
