package com.james.a_hello;

public class User {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("user创建");
	}
	public void init(){
		System.out.println("user初始化");
	}
	public void destroy(){
		System.out.println("user销毁");
	}
}
