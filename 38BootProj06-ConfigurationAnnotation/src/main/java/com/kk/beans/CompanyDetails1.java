package com.kk.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("com1")
public class CompanyDetails1 {
	@Value("${org.ivis.name}")
	private String name1;
	@Value("${org.ivis.type}")
	private String type;
	@Value("${org.ivis.loc}")
	private String location;
	
	@Override
	public String toString() {
		return "CompanyDetails1 [name1=" + name1 + ", type=" + type + ", location=" + location + "]";
	}
}
