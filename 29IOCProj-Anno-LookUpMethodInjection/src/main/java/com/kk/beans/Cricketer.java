package com.kk.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("ckr")
public abstract class  Cricketer{
	@Lookup
	public abstract CricketBat createCricketBat();
	
	public Cricketer() {
		System.out.println("Cricketer.0 param cons");
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
		CricketBat bat=createCricketBat();		// Lookup Method Injection
		//use dependent class obj
		int runs =bat.scoreRuns();
		System.out.println("Cricketer is doing batting and his curent score is :: "+runs);
	}

	
}
