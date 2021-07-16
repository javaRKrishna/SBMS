package com.kk.beans;

public class Bank {
	public double calcIntrAmmount(double amt,double rate,double time) {
		System.out.println("Bank.calcIntrAmmount()");
		return amt*Math.pow(1+rate/100,time)-amt;
	}
}
