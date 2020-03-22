package com.udemy.spring.springcoreadvance.stereotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {

	@Value("Java Architect and Instructor")
	private String tittle;
	
	@Value("Prince")
	private String company;

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Profile [tittle=" + tittle + ", company=" + company + "]";
	}

}
