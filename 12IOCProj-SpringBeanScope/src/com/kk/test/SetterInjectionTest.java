package com.kk.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kk.beans.WishMsgGenerator;

public class SetterInjectionTest {
	public static void main(String[] args) {
		/*
		 //create IOC Container
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/kk/cfgs/applicationContext.xml");
		//get Controller class obj
		WishMsgGenerator generator=factory.getBean("wmg",WishMsgGenerator.class);
		WishMsgGenerator generator1=factory.getBean("wmg",WishMsgGenerator.class);
		System.out.println(generator.hashCode()==generator1.hashCode());
		System.out.println("generator==generator1  ?   "+(generator==generator1));
		//invoke the b.method
		String msg=generator.generateWishMsg("Krishna");
		System.out.println("Result:: "+msg);
		*/
		
		 //create IOC Container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/kk/cfgs/applicationContext.xml");
		//get Controller class obj
		WishMsgGenerator generator=ctx.getBean("wmg",WishMsgGenerator.class);
		WishMsgGenerator generator1=ctx.getBean("wmg",WishMsgGenerator.class);
		System.out.println(generator.hashCode()+" "+generator1.hashCode());
		System.out.println("generator==generator1  ?   "+(generator==generator1));
		//invoke the b.method
		String msg=generator.generateWishMsg("Krishna");  
		System.out.println("Result:: "+msg);
	}
}
