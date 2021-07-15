package com.kk.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kk.beans.WishMsgGenerator;
import com.kk.config.AppConfig;

public class JavaConfigAppTest {
	public static void main(String[] args) {
		//create IOC Container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get Target class obj
		WishMsgGenerator wmg=ctx.getBean("wmg",WishMsgGenerator.class);
		//calling b method
		System.out.println(wmg.generateWishMsg("Krishna"));
	}
}
