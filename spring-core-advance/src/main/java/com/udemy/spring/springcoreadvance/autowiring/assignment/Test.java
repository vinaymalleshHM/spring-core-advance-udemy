package com.udemy.spring.springcoreadvance.autowiring.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/spring/springcoreadvance/autowiring/assignment/config.xml");
		Customer customer = (Customer) context.getBean("customer");
		System.out.println("customer Details : " + customer);
	}

}
