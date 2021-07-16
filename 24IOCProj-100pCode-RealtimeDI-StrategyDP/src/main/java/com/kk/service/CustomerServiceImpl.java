package com.kk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.kk.bo.CustomerBO;
import com.kk.dao.ICustomerDAO;
import com.kk.dto.CustomerDTO;

@Service
public class CustomerServiceImpl implements ICustomerService{
	@Autowired
	@Qualifier("custMySqlDAO")
	private ICustomerDAO dao;
	
	@Override
	public String clcSimpleIntrAmou(CustomerDTO dto) throws Exception {
		//calculate SI ammount
		float intAmt=(dto.getpAmt()*dto.getRate()*dto.getTime())/100.0f;
		//create BO class obj having persistance data
		CustomerBO bo=new CustomerBO();
		bo.setCustName(dto.getCustName());
		bo.setCustAddrs(dto.getCustAddrs());
		bo.setpAmt(dto.getpAmt());
		bo.setRate(dto.getRate());
		bo.setTime(dto.getTime());
		bo.setIntAmt(intAmt);
		//use DAO
		int count =dao.insert(bo);
		return count==1?" Customer registred Successfully ---> SI Amount:: "+intAmt:" Customer not registred ";
	}

}
