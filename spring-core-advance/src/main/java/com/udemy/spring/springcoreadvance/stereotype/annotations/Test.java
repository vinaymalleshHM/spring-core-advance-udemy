package com.udemy.spring.springcoreadvance.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/spring/springcoreadvance/stereotype/annotations/config.xml");
		//by default spring will create the object of @component with class name as
		//reference name if you not specify the name ex.@Component("inst")
//		Instructor instructor = (Instructor) context.getBean("instructor");
		Instructor instructor1 = (Instructor) context.getBean("inst");
		System.out.println("instructor Details : " + instructor1);
		
		Instructor instructor2 = (Instructor) context.getBean("inst");
		System.out.println("instructor Details : " + instructor2);
		
		System.out.println("HashCode : " + instructor1.hashCode());
		System.out.println("HashCode : " + instructor2.hashCode());
	}

}
