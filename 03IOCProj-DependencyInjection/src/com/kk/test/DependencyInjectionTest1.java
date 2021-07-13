package com.kk.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.kk.beans.Person;
import com.kk.beans.Person1;

public class DependencyInjectionTest1 {
	public static void main(String[] args) {
		//create IOC container
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/kk/cfgs/applicationContext.xml");
		//get TargetBean class obj
		Person person=factory.getBean("per",Person.class);
		System.out.println(person);
		
		Person1 person1=factory.getBean("per1",Person1.class);
		System.out.println(person1);
	}
}
