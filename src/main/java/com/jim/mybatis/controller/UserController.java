package com.jim.mybatis.controller;

import com.jim.mybatis.model.entity.User;
import com.jim.mybatis.model.service.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jim on 2017/8/5.
 * This class is ...
 */
@RestController(value = "/user")
public class UserController {

	@Autowired
	private UserMapper userMapper;

	@RequestMapping(method = RequestMethod.GET)
	public List<User> getUsers() {
		return this.userMapper.getUsers();
	}
}
