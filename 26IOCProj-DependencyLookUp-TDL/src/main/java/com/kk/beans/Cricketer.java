package com.kk.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cricketer {
	private String batId;
	
	public Cricketer(String batId) {
		this.batId=batId;
		System.out.println("Cricketer.1 param cons()");
	}
	
	public Cricketer() {
		System.out.println("Cricketer.Cricketer()");
	}
	
	public void fielding() {
		System.out.println("Cricketer is doing fielding");
	}
	
	public void bowling() {
		System.out.println("Cricketer is doing bowling()");
	}
	
	public void wicketKeeping() {
		System.out.println("Cricketer is doing wicketKeeping()");
	}
	
	public void batting() {
		//create an extra IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/kk/cfgs/applicationContext.xml");
		//perform Dependency Lookup to get Dependent class obj
		CricketBat bat=ctx.getBean(batId,CricketBat.class);		//Dependency Lookup
		//use dependent class obj
		int runs =bat.scoreRuns();
		System.out.println("Cricketer is doing batting and his curent score is :: "+runs);
	}
}
