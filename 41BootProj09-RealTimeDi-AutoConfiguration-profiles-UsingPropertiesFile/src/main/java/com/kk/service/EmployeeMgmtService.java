package com.kk.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kk.bo.EmployeeBO;
import com.kk.dao.IEmployeeDAO;
import com.kk.dto.EmployeeDTO;

@Service
public class EmployeeMgmtService implements IEmployeeMgmtService {
	@Autowired
	private IEmployeeDAO dao;
	
	@Override
	public List<EmployeeDTO> fetchEmpsByDesgs(String[] desg) throws Exception {
		String cond=null;
		//convert desg[] into SQL IN clause String condition ('SOFTWARE',TEACHER',...)
		StringBuilder buffer=new StringBuilder("(");
		for(int i=0;i<desg.length;i++) {
			if(i==desg.length-1)
				buffer.append("'"+desg[i]+"')");
			else
				buffer.append("'"+desg[i]+"',"); 	//for other than last element
		}//for
		//convert StringBuilder object into String
		cond=buffer.toString();
		System.out.println("condition:: "+cond);
		//use DAO
		List<EmployeeBO> listBO=dao.getEmpByDesg(cond);
		//convert ListBO to ListDTO
		List<EmployeeDTO> listDTO=new ArrayList();
		listBO.forEach(bo->{
			EmployeeDTO dto=new EmployeeDTO(); 
			BeanUtils.copyProperties(bo, dto);
			dto.setSrNo(listDTO.size()+1);
			//add each obj of DTO class to ListDTO
			listDTO.add(dto);
		});
		return listDTO;
	}

}
