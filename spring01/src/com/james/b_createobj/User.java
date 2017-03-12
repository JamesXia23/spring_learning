package com.james.b_createobj;

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
	public User(int id) {
		super();
		this.id = id;
		System.out.println("user创建,id = " + id);
	}
	
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("user创建,id = " + id + ",name = " + name);
	}
	public void init(){
		System.out.println("user初始化");
	}
	public void destroy(){
		System.out.println("user销毁");
	}
}
