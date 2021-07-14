package com.kk.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kk.beans.Robot;

public class Test {
	public static void main(String[] args) {
		//create IOC Container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/kk/cfgs/applicationContext.xml");
		//get Controller class obj
		Robot robot=ctx.getBean("robot",Robot.class);
		System.out.println(robot);
		
		Robot robot1=ctx.getBean("com.kk.beans.Robot",Robot.class);
		System.out.println(robot1);
		
		Robot robot2=ctx.getBean("com.kk.beans.Robot#1",Robot.class);
		System.out.println(robot2);
	}
}
 