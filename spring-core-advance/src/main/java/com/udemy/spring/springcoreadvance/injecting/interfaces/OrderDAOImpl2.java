package com.udemy.spring.springcoreadvance.injecting.interfaces;

import org.springframework.stereotype.Component;

//@Component //if we add @Component here it will throw exception bcz OrderDAO is implementd by two classes  
@Component("dao2")
public class OrderDAOImpl2 implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside OrderDAOImpl2 createOrder()");
	}

}
