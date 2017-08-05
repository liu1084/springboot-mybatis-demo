package com.jim.mybatis.model.service;

import com.jim.mybatis.model.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by jim on 2017/8/5.
 * This class is ...
 */
@Mapper
public interface UserMapper {
	@Select(value = "SELECT * FROM user")
	List<User> getUsers();
}
