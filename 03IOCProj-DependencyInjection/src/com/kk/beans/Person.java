package com.kk.beans;

import java.util.Date;

public class Person {
	private int pId;
	private String pName;
	private String pAdd;
	private float income;
	
	public void setpId(int pId) {
		this.pId = pId;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setpAdd(String pAdd) {
		this.pAdd = pAdd;
	}
	public void setIncome(float income) {
		this.income = income;
	}
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", pAdd=" + pAdd + ", income=" + income + "]";
	}
}
