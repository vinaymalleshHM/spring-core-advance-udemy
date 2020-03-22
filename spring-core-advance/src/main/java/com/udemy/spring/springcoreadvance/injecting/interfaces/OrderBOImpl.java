package com.udemy.spring.springcoreadvance.injecting.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("bo")
public class OrderBOImpl implements OrderBO {

	
//	private OrderDAO dao;
	
	@Autowired
//	@Qualifier("dao")//OrderDAO is implementd by two classes and spring will throw exception to over come we use this
	@Qualifier("dao2")
	private OrderDAO dao;
	
	@Override
	public void placeOrder() {
		System.out.println("Inside Order BO");
		dao.createOrder();
	}

}
