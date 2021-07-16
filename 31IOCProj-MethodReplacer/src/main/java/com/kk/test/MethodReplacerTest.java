package com.kk.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kk.beans.Bank;

public class MethodReplacerTest {
	public static void main(String[] args) {
		//create IOC Container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/kk/cfgs/applicationContext.xml");
		//get Bean class obj
		Bank bank=ctx.getBean("bank",Bank.class);
		//invoke method
		System.out.println("Interest Ammount:: "+bank.calcIntrAmmount(20000,2,3));
	}
}
