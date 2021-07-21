package com.kk.beans;

import javax.inject.Named;

import org.springframework.stereotype.Component;

@Named("dotNet")
//@Component("dotNet")
public class DotNetCourseMaterial implements ICourceMaterial {

	public DotNetCourseMaterial() {
		System.out.println("DotNetCourseMaterial.0 param Cons");
	}
	
	@Override
	public String courseContent() {
		System.out.println("DotNetCourseMaterial.courseContent()");
		return "1 c# oops,2 c# Exception Handling,3.c# Collection and Reflaction api";
	}

	@Override
	public double price() {
		System.out.println("DotNetCourseMaterial.price()");
		return 300;
	}

}
