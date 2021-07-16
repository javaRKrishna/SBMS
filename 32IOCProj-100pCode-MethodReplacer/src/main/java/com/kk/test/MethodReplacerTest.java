package com.kk.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kk.beans.Bank;
import com.kk.config.AppConfig;

public class MethodReplacerTest {
	public static void main(String[] args) {
		//create IOC Container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get Bean class obj
		Bank bank=ctx.getBean("bank",Bank.class);
		//invoke method
		System.out.println("Interest Ammount:: "+bank.calcIntrAmmount(20000,2,3));
	}
}
