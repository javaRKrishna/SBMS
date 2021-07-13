package com.kk.comp;

public class Student extends Person{
	private int rollNo;
	private String course;
	//Has a property
	private Food food;
	
	public Student(Food food) {
		System.out.println("Student:: 1-param Cons");
		this.food=food;
	}

	@Override
	public void work() {
		System.out.println("Student is studing B.Tech and taking food)");
	}
}
