package com.kk.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages ="com.kk")	//alternate to <context:component-scan/>
public class AppConfig {
	@Bean(name="ldt")
	@Scope("prototype")
	public LocalDateTime createLocalDateTime() {
		System.out.println("AppConfig.createLocalDateTime()");
		LocalDateTime ldt=LocalDateTime.now();
		return ldt;
	}
}
