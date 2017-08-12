package com.jim.mybatis.model.service;

import com.jim.mybatis.model.entity.Book;

import java.util.List;

/**
 * Created by jim on 2017/8/5.
 * This class is ...
 */
public interface BookMapper {

	List<Book> books();

	Book findBookById(String id);

	List<Book> getDownloadTop10();
}
