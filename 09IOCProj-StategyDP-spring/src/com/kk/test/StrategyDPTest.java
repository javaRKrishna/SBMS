package com.kk.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.kk.comp.Flipkart;

public class StrategyDPTest {
	public static void main(String[] args) {
		//create IOC container
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/kk/cfgs/applicationContext.xml");
		//get Target class obj
		Flipkart fpkt=factory.getBean("fpkt",Flipkart.class);
		//invoke b.method
		String result=fpkt.shopping(new String[] {"shirt","trouser","watch"}, 
																new float[] {4000.0f,6000.0f,30000.0f });
		System.out.println(result);
	}	
}
