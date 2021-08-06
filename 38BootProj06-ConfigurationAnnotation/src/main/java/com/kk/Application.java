package com.kk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.kk.beans.CompanyDetails;
import com.kk.beans.CompanyDetails1;

@SpringBootApplication 
public class Application {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(Application.class, args);
		//get spring bean class obj
		CompanyDetails com=ctx.getBean("com",CompanyDetails.class);
		System.out.println("Com data  "+com);
		
		CompanyDetails1 com1=ctx.getBean("com1",CompanyDetails1.class);
		System.out.println("Com1 data  "+com1);
		//close container
		((ConfigurableApplicationContext) ctx).close(); 
	}

}
