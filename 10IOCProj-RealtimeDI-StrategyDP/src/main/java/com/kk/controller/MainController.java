package com.kk.controller;

import com.kk.dto.CustomerDTO;
import com.kk.service.ICustomerService;
import com.kk.vo.CustomerVO;

public class MainController {
	private ICustomerService service;

	public MainController(ICustomerService service) {
		System.out.println("MainController.MainController()");
		this.service = service;
	}
	
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
