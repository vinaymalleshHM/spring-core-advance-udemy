package com.udemy.spring.springcoreadvance.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

public class Employee {
	@Autowired(required = false) // 1.field level
	@Qualifier("address123") // the Qualifier will search based on name
	private Address address;

	//@Autowired  //3.constructor level
	public Employee(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	//@Autowired  //2.setter level
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	

}
