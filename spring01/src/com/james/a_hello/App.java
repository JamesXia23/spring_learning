package com.james.a_hello;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {
	// 1.通过工厂类的IOC容器创建对象
	@Test
	public void testIOC() {
		// 得到xml资源
		Resource res = new ClassPathResource(
				"com/james/a_hello/applicationContext.xml");
		// 创建ioc容器对象
		BeanFactory bf = new XmlBeanFactory(res);
		// 得到容器创建的对象
		User user = (User) bf.getBean("user");
		System.out.println(user);
	}
	@Test
	public void testAc() {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/james/a_hello/applicationContext.xml");
		User user = (User) ac.getBean("user");
		System.out.println(user);
	}
	@Test
	public void testBean(){
		//使用ApplicationContext的实现类,因为要调用其中的销毁方法
		ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext("com/james/a_hello/applicationContext.xml");
		System.out.println("容器创建");
		cpxac.getBean("user");
		
		cpxac.destroy();
	}
}
