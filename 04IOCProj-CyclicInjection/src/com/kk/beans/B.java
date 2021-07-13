package com.kk.beans;

import java.util.Date;

public class B {
	private A a;

	public void setA(A a) {
		System.out.println("B.setA()");
		this.a = a;
	}

	@Override
	public String toString() {
		return "From B";
	}
}
