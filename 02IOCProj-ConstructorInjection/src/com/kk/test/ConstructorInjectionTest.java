package com.kk.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.kk.beans.WishMsgGenerator;

public class ConstructorInjectionTest {
	public static void main(String[] args) {
		//locate and hold spring bean cgf file
		FileSystemResource res=new FileSystemResource("src/com/kk/cfgs/applicationContext.xml");
		//create IOC container
		XmlBeanFactory factory=new XmlBeanFactory(res);
		//get TargetBean class obj
		Object obj=factory.getBean("wmg");
		//type casting 
		WishMsgGenerator generator=(WishMsgGenerator)obj;
		//invoke the b.method
		String msg=generator.generateWishMsg("Krishna");
		System.out.println("Result:: "+msg);
	}
}
