package com.jim.mybatis.model.service;

import com.jim.mybatis.model.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by jim on 2017/8/5.
 * This class is ...
 */
@Mapper
public interface BookMapper {

	List<Book> find();

	Book findBookById(String id);
}
