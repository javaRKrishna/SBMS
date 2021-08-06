package com.kk.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kk.bo.EmployeeBO;

@Repository
public class EmployeeDAOImpl implements IEmployeeDAO {
	private final String GET_EMPS_BY_DESG="SELECT EID,ENAME,JOB,SALARY,DEPTNO,MNO FROM EMPLOYEE WHERE JOB IN"; 
	@Autowired
	private DataSource ds;
	
	@Override
	public List<EmployeeBO> getEmpByDesg(String cond) throws Exception {
		System.out.println("Data Source->>>>"+ds.getClass());
		List<EmployeeBO> listBO=null;
		try(
			//get pooled jdbc con
			Connection con=ds.getConnection();
			//create Statement obj
			Statement st=con.createStatement();
			){
			//send and execute SQL query in DB s/w
			//SELECT ENO,ENAME,JOB,SALARY,DEPTNO,MNO FROM SEMPLOYEE WHERE JOB IN('SOFTWARE',TEACHER',...) ORDER BY JOB
			ResultSet rs=st.executeQuery(GET_EMPS_BY_DESG+cond+" ORDER BY JOB");
			System.out.println("Query--> "+GET_EMPS_BY_DESG);
			//	convert RS obj records to List of BO class objs
			listBO=new ArrayList();
			EmployeeBO bo=null;
			while(rs.next()) {
				bo=new EmployeeBO();
				bo.setEId(rs.getInt(1));
				bo.setEName(rs.getString(2));
				bo.setJob(rs.getString(3));
				bo.setSal(rs.getDouble(4));
				bo.setDeptNo(rs.getInt(5));
				bo.setMNo(rs.getInt(6));
				listBO.add(bo);
			}//while
		}//try
		catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		return listBO;
	}//()
}//class
