package com.kk.beans;

import java.util.Date;

public class Person1 {
	private int pId;
	private String pName;
	private String pAdd;
	private float income;
	
	public Person1(int pId, String pName, String pAdd, float income) {
		this.pId = pId;
		this.pName = pName;
		this.pAdd = pAdd;
		this.income = income;
	}

	@Override
	public String toString() {
		return "Person1 [pId=" + pId + ", pName=" + pName + ", pAdd=" + pAdd + ", income=" + income + "]";
	}
	
	
	
}
