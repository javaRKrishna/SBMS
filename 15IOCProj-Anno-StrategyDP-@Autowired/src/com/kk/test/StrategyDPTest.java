package com.kk.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kk.comp.Flipkart;

public class StrategyDPTest {
	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/kk/cfgs/applicationContext.xml");
		//get Target class obj
		Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
		//invoke b.method
		String result=fpkt.shopping(new String[] {"shirt","trouser","watch"}, 
																new float[] {4000.0f,6000.0f,30000.0f });
		System.out.println(result);
	}	
}
