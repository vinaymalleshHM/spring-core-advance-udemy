package com.udemy.spring.springcoreadvance.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/spring/springcoreadvance/injecting/interfaces/config.xml");
		OrderBOImpl orderBOImpl = (OrderBOImpl) context.getBean("bo");
		orderBOImpl.placeOrder();
		
	}

}
