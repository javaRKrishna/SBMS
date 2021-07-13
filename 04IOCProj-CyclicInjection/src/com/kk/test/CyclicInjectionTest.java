package com.kk.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.kk.beans.A;
import com.kk.beans.B;

public class CyclicInjectionTest {
	public static void main(String[] args) {
		//locate and hold spring bean cgf file
		//create IOC container
		XmlBeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/com/kk/cfgs/applicationContext.xml"));
		//get TargetBean class obj
		A a=(A)factory.getBean("a1");
		System.out.println(a);
		
		B b=(B)factory.getBean("b1");
		System.out.println(b);
	}
}
