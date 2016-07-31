package com.james.c_property;

import org.springframework.stereotype.Component;

@Component("userDao4")
public class UserDao {
//	public UserDao(){
//		System.out.println("查询db");
//	}
	public UserDao(){
		super();
	}
	public UserDao(int id){
		System.out.println("我被创建了" + id);
	}
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("存入db");
	}
}
