package com.kk.beans;

import java.util.Date;

public class VoterVerifier {
	private String name;
	private float age;
	private Date verificationDate;
	
	public VoterVerifier() {
		System.out.println("VoterVerifier.VoterVerifier()");
	}
	
	public void setName(String name) {
		System.out.println("VoterVerifier.setName()");
		this.name = name;
	}
	public void setAge(float age) {
		System.out.println("VoterVerifier.setAge()");
		this.age = age;
	}
	
	//init life cycle method
	public void myInit() {
		System.out.println("Custome init method");
		verificationDate=new Date();  	//initializing bean property that is not participating injection
		//validation
		if(name==null || age<=0)
			throw new IllegalArgumentException("invalid inputs are given for name , age properties");
	}
	
	//destroy method
	public void myDestroy() {
		System.out.println("VoterVerifier.myDestroy()");
		name=null;
		age=0;
		verificationDate=null;
	}
	
	public String checkVotingEligibility() {
		if(age<18)
			return "Mr/Miss/Mrs. "+name+" u r not eligible for voting wait "+(18-age)+" years to cast u r vote";
		else
			return "Mr/Miss/Mrs. "+name+" u r eligible for voting";
	}
	
	
	
}	
