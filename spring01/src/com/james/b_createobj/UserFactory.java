package com.james.b_createobj;

public class UserFactory {
	public static User getStaticInstance(){
		return new User(18, "静态方法创建");
	}
	public User getInstance(){
		return new User(20, "非静态方法创建");
	}
}
