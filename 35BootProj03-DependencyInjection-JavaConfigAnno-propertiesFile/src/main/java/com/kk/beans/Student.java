package com.kk.beans;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.kk.beans.ICourceMaterial;

@Named("stud")
//@Component("stud")
public final class Student {
	/*
	@Autowired
	@Qualifier("dotNet")
	@Qualifier("${course.choose}")
	@Qualifier("courseId")
	*/
	//@Inject
	//@Resource
	//@Named("courseId")
	@Resource(name = "courseId")
	public ICourceMaterial material;
	
	public Student() {
		System.out.println("Student.Student()");
	}
	
	public void preparation(String examName) {
		System.out.println("Student.preparation()-->"+examName);
		String course=material.courseContent();
		double price=material.price();
		System.out.println("preparation is going on using::"+course+"  material with price"+price);
		System.out.println("preparation is completed for "+examName);
	}
}
