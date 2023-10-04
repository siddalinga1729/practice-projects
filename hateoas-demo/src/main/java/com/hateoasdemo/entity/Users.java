package com.hateoasdemo.entity;

import org.springframework.hateoas.ResourceSupport;

public class Users extends ResourceSupport {
	private String name;
	private Long salary;

	public Users(String name, Long salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Users [name=" + name + ", salary=" + salary + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

}
