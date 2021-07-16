package com.kk.config;

import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.kk")
@PropertySource(value = "com/kk/commons/jdbc.properties")
@ImportResource(locations = "com/kk/cfgs/applicationContext.xml")
public class AppConfig {
	@Autowired
	private Environment env;

	/*
	@Bean(name="oraDs")
	public DriverManagerDataSource createDsForOracle() {
		DriverManagerDataSource drds=new DriverManagerDataSource();
		drds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		drds.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		drds.setUsername("system");
		drds.setPassword("manager");
		return drds;
	}
	*/
	@Bean(name="drds")
	public DriverManagerDataSource createDsForMySql() {
		DriverManagerDataSource drds=new DriverManagerDataSource();
		drds.setDriverClassName(env.getRequiredProperty("jdbc.driver"));
		drds.setUrl(env.getRequiredProperty("jdbc.url"));
		drds.setUsername(env.getRequiredProperty("jdbc.user"));
		drds.setPassword(env.getRequiredProperty("jdbc.pwd"));
		return drds;
	}
}
