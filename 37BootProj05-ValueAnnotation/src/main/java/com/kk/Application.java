package com.kk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.kk.beans.BillGenerator;

@SpringBootApplication 
public class Application {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(Application.class, args);
		//get spring bean class obj
		BillGenerator gen=ctx.getBean("bill",BillGenerator.class);
		System.out.println("data  "+gen);
		//close container
		((ConfigurableApplicationContext) ctx).close(); 
	}

}
