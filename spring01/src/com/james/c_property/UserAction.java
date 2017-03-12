package com.james.c_property;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("userAction4")
public class UserAction {
	@Resource(name="userService4")
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
		System.out.println("userService成功注入");
	}
	public void save(){
		userService.save();
	}
}
