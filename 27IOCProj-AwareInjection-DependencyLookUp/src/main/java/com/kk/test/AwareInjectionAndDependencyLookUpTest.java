package com.kk.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kk.beans.Cricketer;

public class AwareInjectionAndDependencyLookUpTest {
	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/kk/cfgs/applicationContext.xml");
		//get Target spring bean class obj
		Cricketer cricketer=ctx.getBean("ckr",Cricketer.class);
		//invoke method b.method
		cricketer.fielding();
		cricketer.bowling();
		cricketer.batting();
		
		//close container
		ctx.close();
		
	}
	
}
