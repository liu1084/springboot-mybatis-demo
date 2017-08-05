package com.jim.mybatis.controller;

import com.jim.mybatis.model.entity.Book;
import com.jim.mybatis.model.service.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jim on 2017/8/5.
 * This class is ...
 */
@RestController
@EnableAutoConfiguration
public class BookController {

	@Autowired
	private BookMapper bookMapper;

	@RequestMapping(value = {"/book"}, method = RequestMethod.GET)
	public List<Book> find() {
		return this.bookMapper.find();
	}

	@RequestMapping(value = "/book/{id}", method = RequestMethod.GET)
	public Book findBookById(@PathVariable("id") String id){
		return bookMapper.findBookById(id);
	}
}
