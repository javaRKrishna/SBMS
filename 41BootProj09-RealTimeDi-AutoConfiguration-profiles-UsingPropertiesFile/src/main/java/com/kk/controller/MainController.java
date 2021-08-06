package com.kk.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kk.dto.EmployeeDTO;
import com.kk.service.IEmployeeMgmtService;
import com.kk.vo.EmployeeVO;

@Controller
public class MainController {
	@Autowired
	private IEmployeeMgmtService service;
	
	public List<EmployeeVO> showEmpsByDesgs(String desgs[]) throws Exception{
		//use Service
		List<EmployeeDTO> listDTO=service.fetchEmpsByDesgs(desgs);
		//convert listDTO to listVO
		List<EmployeeVO> listVO=new ArrayList();
		listDTO.forEach(dto->{
			EmployeeVO vo=new EmployeeVO();
			BeanUtils.copyProperties(dto, vo);
			vo.setSrNo(String.valueOf(dto.getSrNo()));
			vo.setEId(String.valueOf(dto.getEId()));
			vo.setSal(String.valueOf(dto.getSal()));
			vo.setDeptNo(String.valueOf(dto.getDeptNo()));
			vo.setMNo(String.valueOf(dto.getMNo()));
			listVO.add(vo);
		});
		return listVO;
	}//method
}//class
