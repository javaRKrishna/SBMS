package com.kk.factory;

import com.kk.comp.Employee;
import com.kk.comp.Food;
import com.kk.comp.Person;
import com.kk.comp.Student;

public class PersonFactory {
	public static Person getPerson(String type) {
		//create Dependent class obj
		Food food =new Food();
		//create Target class obj
		Person per =null;
		if(type.equalsIgnoreCase("emp"))
			per =new Employee(food);
		else if (type.equalsIgnoreCase("stud"))
			per=new Student(food);
		else
			throw new IllegalArgumentException("Invalid person type");
		return per;
	}
}
