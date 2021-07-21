package com.kk.beans;

import javax.inject.Named;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Named("java")
//@Component("java")
//@Primary
public class JavaCourseMaterial implements ICourceMaterial {

	public JavaCourseMaterial() {
		System.out.println("JavaCourseMaterial.0 param Cons");
	}
	
	@Override
	public String courseContent() {
		System.out.println("JavaCourseMaterial.courseContent()");
		return "1 oops,2 Exception Handling,3.Collection and Reflaction api";
	}

	@Override
	public double price() {
		System.out.println("JavaCourseMaterial.price()");
		return 500;
	}

}
