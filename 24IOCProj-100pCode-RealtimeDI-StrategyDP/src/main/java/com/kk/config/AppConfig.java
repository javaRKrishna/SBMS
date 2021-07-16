package com.kk.config;

import java.sql.DriverManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.kk")
public class AppConfig {
	
	@Bean(name="oraDs")
	public DriverManagerDataSource createDsForOracle() {
		DriverManagerDataSource drds=new DriverManagerDataSource();
		drds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		drds.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		drds.setUsername("system");
		drds.setPassword("manager");
		return drds;
	}
	
	@Bean(name="MySqlDs")
	public DriverManagerDataSource createDsForMySql() {
		DriverManagerDataSource drds=new DriverManagerDataSource();
		drds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		drds.setUrl("jdbc:mysql:///SBMS");
		drds.setUsername("root");
		drds.setPassword("root");
		return drds;
	}
}
