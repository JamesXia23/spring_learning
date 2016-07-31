package com.james.c_property;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	//使用ApplicationContext的实现类,因为要调用其中的销毁方法
	private ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext("com/james/c_property/applicationContext.xml");
	@Test
	public void testBean(){
		System.out.println("容器创建");
//		cpxac.getBean("user");
//		cpxac.getBean("user1");
//		cpxac.getBean("user2");
//		ClassPathXmlApplicationContext a = new ClassPathXmlApplicationContext();
		UserAction userAction = (UserAction) cpxac.getBean("userAction4");
		userAction.save();
		//cpxac.destroy();
	}
}
