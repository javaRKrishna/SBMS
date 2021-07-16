package com.kk.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kk.beans.Cricketer;
import com.kk.config.AppConfig;

public class LookUpMethodInjectionTest {
	public static void main(String[] args) {
		//create IOC container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get Target spring bean class obj
		Cricketer cricketer=ctx.getBean("ckr",Cricketer.class);
		System.out.println(cricketer.getClass()+"......"+cricketer.getClass().getSuperclass());
		System.out.println("...............................");
		//invoke method b.method
		cricketer.fielding();
		cricketer.bowling();
		cricketer.batting();
		
		//close container
		ctx.close();
		
	}
	
}
