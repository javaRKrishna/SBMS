package com.kk.test;

import com.kk.comp.Food;
import com.kk.comp.Student;

public class College {
	public static void main(String[] args) {
		Food food =new Food();
		Student st=new Student(food);
		st.work();
	}
}
