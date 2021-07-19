package com.kk;

import java.io.PrintStream;
import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.kk.beans.WishMsgGenerator;

@SpringBootApplication
public class Application {
	
	@Bean(name="ldt")
	@Scope("prototype")
	public LocalDateTime createLocalDateTime() {
		System.out.println("Application.createLocalDateTime()");
		LocalDateTime ldt=LocalDateTime.now();
		return ldt;
	}

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(Application.class, args);
		Application bean=ctx.getBean("application",Application.class);
		System.out.println(bean.getClass()+"   "+bean.hashCode() );
		System.out.println(ctx.getClass());
		System.out.println("all beans ids:: "+Arrays.toString(ctx.getBeanDefinitionNames()));
		System.out.println("beans count:: "+ctx.getBeanDefinitionCount());
		//get Target spring bean class from IOC container
		WishMsgGenerator generator=ctx.getBean("wmg",WishMsgGenerator.class);
		//invoke methods
		String result=generator.generateWishMsg("Krishna");
		System.out.println(result);
		//close container
		((ConfigurableApplicationContext) ctx).close();
	}
}
