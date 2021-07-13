package com.kk.test;

import com.kk.comp.Employee;
import com.kk.comp.Food;
import com.kk.comp.Student;

public class Company {
	public static void main(String[] args) {
		Food food =new Food();
		Employee emp=new Employee(food);
		emp.work();
	}
}
