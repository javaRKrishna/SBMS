package com.kk.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.kk.beans.Person;
import com.kk.beans.Person1;

public class DependencyInjectionTest {
	public static void main(String[] args) {
		//locate and hold spring bean cgf file
		//create IOC container
		XmlBeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/com/kk/cfgs/applicationContext.xml"));
		//get TargetBean class obj
		Person person=(Person)factory.getBean("per");
		System.out.println(person);
		
		Person1 person1=(Person1)factory.getBean("per1");
		System.out.println(person1);
	}
}
