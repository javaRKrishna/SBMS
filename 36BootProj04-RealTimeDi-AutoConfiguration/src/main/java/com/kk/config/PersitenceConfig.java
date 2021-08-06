package com.kk.config;

import java.beans.PropertyVetoException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
public class PersitenceConfig {
	@Autowired
	private Environment env;
	
	@Bean(name="c3P0Ds")
	public ComboPooledDataSource createDs() throws Exception {
		System.out.println("PersitenceConfig.createDs()");
		ComboPooledDataSource c3pODs=new ComboPooledDataSource();
		c3pODs.setDriverClass(env.getProperty("spring.datasource.driver-class-name"));
		c3pODs.setJdbcUrl(env.getProperty("spring.datasource.url"));
		c3pODs.setUser(env.getProperty("spring.datasource.username"));
		c3pODs.setPassword(env.getProperty("spring.datasource.password"));
		return c3pODs;
	}
}
