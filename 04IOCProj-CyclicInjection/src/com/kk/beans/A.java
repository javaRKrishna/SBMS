package com.kk.beans;

import java.util.Date;

public class A {
	private B b;

	public void setB(B b) {
		System.out.println("A.setB()");
		this.b = b;
	}

	@Override
	public String toString() {
		return "From A";
	}
}
