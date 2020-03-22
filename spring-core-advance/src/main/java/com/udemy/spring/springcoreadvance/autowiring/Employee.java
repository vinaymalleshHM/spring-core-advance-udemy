package com.udemy.spring.springcoreadvance.autowiring;

import lombok.Data;

@Data
public class Employee {
	private Address address;

	public Employee(Address address) {
		super();
		this.address = address;
	}
	

}
