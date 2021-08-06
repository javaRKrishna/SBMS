package com.kk.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("com")
@ConfigurationProperties(prefix = "org.ivis")
@Data
public class CompanyDetails {
	private String name;
	private String type;
	private String loc;
	@Override
	public String toString() {
		return "CompanyDetails [name=" + name + ", type=" + type + ", loc=" + loc + "]";
	}
	
	
	
}
