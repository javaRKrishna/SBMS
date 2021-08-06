package com.kk.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeDTO implements Serializable{
	private Integer srNo;
	private Integer eId;
	private String eName;
	private String job;
	private Double sal;
	private Integer deptNo;
	private Integer mNo;
}
