package com.james.c_property;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("userService4")
public class UserService {
	@Resource(name="userDao4")
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
		System.out.println("userDao成功注入");
	}

	public void save() {
		// TODO Auto-generated method stub
		userDao.save();
	}
}