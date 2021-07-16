package com.kk.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cricketer implements ApplicationContextAware{
	private String batId;
	private ApplicationContext ctx;
	
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("Cricketer.setApplicationContext()");
		this.ctx=ctx;
	} 
	
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
		CricketBat bat=ctx.getBean(batId,CricketBat.class);		//Dependency Lookup
		//use dependent class obj
		int runs =bat.scoreRuns();
		System.out.println("Cricketer is doing batting and his curent score is :: "+runs);
	}

	
}
