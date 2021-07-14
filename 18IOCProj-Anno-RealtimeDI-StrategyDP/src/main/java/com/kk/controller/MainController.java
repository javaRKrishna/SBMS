package com.kk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kk.dto.CustomerDTO;
import com.kk.service.ICustomerService;
import com.kk.vo.CustomerVO;

@Controller
public class MainController {
	@Autowired
	private ICustomerService service;

	public String processCustomer(CustomerVO vo)throws Exception{
		//convert CustomerVO to CustomerDTO
		CustomerDTO dto=new CustomerDTO();
		dto.setCustName(vo.getCustName());
		dto.setCustAddrs(vo.getCustAddrs());
		dto.setpAmt(Float.parseFloat(vo.getpAmt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		//use service
		String result=service.clcSimpleIntrAmou(dto);
		return result;
	}
}
