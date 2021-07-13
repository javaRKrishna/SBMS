package com.kk.dao;

import com.kk.bo.CustomerBO;

public interface ICustomerDAO {
	public int insert(CustomerBO bo)throws Exception;
}
