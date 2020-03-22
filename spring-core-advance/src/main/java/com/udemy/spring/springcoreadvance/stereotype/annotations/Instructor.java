package com.udemy.spring.springcoreadvance.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

//@Data
//by default spring will create the object of @component with class name as
//reference name if you not specify the name ex.@Component("inst")
//@Component()
@Component("inst")
@Scope("prototype") // if u specify scope as prototype then don't use @data bcz compiler will not
//know weather the class has getter and setter so it will generate same hashcode if u use @Scope("prototype")
public class Instructor {

//	@Value("10") // @Value will override the assigned value
//	@Value("#{66+44}") 
//	@Value("-99") // -99 will be inject so over come this
//	@Value("#{T(java.lang.Math).abs(-99)}") 
	@Value("#{T(java.lang.Integer).MIN_VALUE}")
	private int id = 20;
	
//	@Value("Prince")
//	@Value("#{'Prince Winay'}")
//	@Value("#{'Prince Winay'.toUpperCase()}")
	@Value("#{new java.lang.String('Prince Winay').toUpperCase()}")
	private String name = "test";
	
//	@Value("#{2+4>5}")
	@Value("#{2+4>8 ? true:false}")
	private boolean active;
	

	@Value("#{topics}")
	private List<String> topics;

	@Autowired
	private Profile profile;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getTopics() {
		return topics;
	}

	public void setTopics(List<String> topics) {
		this.topics = topics;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", active=" + active + ", topics=" + topics + ", profile="
				+ profile + "]";
	}

}
