package com.udemy.spring.springcoreadvance.injecting.interfaces;

import org.springframework.stereotype.Component;

//@Component
@Component("dao")
public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside OrderDAO createOrder()");
	}

}
