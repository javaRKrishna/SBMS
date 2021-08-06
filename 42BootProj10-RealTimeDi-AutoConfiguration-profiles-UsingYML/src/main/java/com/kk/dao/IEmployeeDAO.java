package com.kk.dao;


import java.util.List;

import com.kk.bo.EmployeeBO;

public interface IEmployeeDAO {
	public List<EmployeeBO> getEmpByDesg(String cond) throws Exception;
}
