package com.kk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.kk.beans.Student;

@SpringBootApplication
@ImportResource("com/kk/cfgs/applicationContext.xml")
public class Application {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(Application.class, args);
		//get Target spring bean class obj
		Student student=ctx.getBean("stud",Student.class);
		//invoke b.method
		student.preparation("TCS");
		//close container
		((ConfigurableApplicationContext) ctx).close();
	}

}
