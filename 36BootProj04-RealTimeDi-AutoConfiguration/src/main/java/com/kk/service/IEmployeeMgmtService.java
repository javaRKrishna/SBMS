package com.kk.service;

import java.util.List;

import com.kk.dto.EmployeeDTO;

public interface IEmployeeMgmtService {
	public List<EmployeeDTO> fetchEmpsByDesgs(String desg[]) throws Exception;
}
