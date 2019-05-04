package com.spring.component;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class Emp {
	private String name;
	
	
	private int age;
	
	
	
public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

public Emp(String name, int age) {
	
		super();
		this.name = name;
		this.age = age;
	}

public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


public void show(){
	System.out.println("name : "+name+ "\n"+"age : "+age);
}
}

