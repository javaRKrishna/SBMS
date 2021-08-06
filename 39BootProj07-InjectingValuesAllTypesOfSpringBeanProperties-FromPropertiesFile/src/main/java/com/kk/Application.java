package com.kk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.kk.model.Employees;

@SpringBootApplication 
public class Application {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(Application.class, args);
		//get spring bean class obj
		Employees emp=ctx.getBean("emp",Employees.class);
		System.out.println("emp data  "+emp);
		//close container
		((ConfigurableApplicationContext) ctx).close(); 
	}

}
