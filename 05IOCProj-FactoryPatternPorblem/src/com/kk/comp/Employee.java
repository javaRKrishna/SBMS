package com.kk.comp;

public class Employee extends Person{
	private String desg;
	private float sal;
	//Has a property
	private Food food;
	
	public Employee(Food food) {
		System.out.println("Employee.Employee 1-param Cons");
		this.food=food;
	}

	@Override
	public void work() {
		System.out.println("Employee is working on Software Development and taking food)");
	}
}
