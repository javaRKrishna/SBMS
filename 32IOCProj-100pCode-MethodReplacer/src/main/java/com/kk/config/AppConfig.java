package com.kk.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "com.kk")
@ImportResource("com/kk/cfgs/applicationContext.xml")
public class AppConfig {
	
}
