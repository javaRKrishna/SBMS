package com.kk.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("uI")
//@Primary
public class UiCourseMaterial implements ICourceMaterial {

	public UiCourseMaterial() {
		System.out.println("UiCourseMaterial.0 param Cons");
	}
	
	@Override
	public String courseContent() {
		System.out.println("UiCourseMaterial.courseContent()");
		return "1 HTML,2 CSS,3. JS";
	}

	@Override
	public double price() {
		System.out.println("UiCourseMaterial.price()");
		return 700;
	}

}
