package com.kk.model;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("emp")
@Data
@ConfigurationProperties(prefix = "emp.info")
public class Employees {
	private String name;
	private long id;
	private String[] nickNames;
	private List<String> teamMem;
	private Set<Long> phoneNo;
	private Map<String,Object> idDetails;
	private Company compDetails;
	
}
