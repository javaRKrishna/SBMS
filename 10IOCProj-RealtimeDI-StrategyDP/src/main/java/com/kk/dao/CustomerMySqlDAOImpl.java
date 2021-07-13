package com.kk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.kk.bo.CustomerBO;

public class CustomerMySqlDAOImpl implements ICustomerDAO {
	private static final String REALTIME_CUSTOMER_INSERT_QUERY="INSERT INTO REALTIMEDI_CUSTOMER(CUSTNAME,CUSTADDRS,PAMT,RATE,TIME,INTERESTAMOUNT) VALUES(?,?,?,?,?,?)";
	private DataSource ds;
	
	public CustomerMySqlDAOImpl(DataSource ds) {
		System.out.println("CustomerMySqlDAOImpl::1 patam cons");
		this.ds = ds;
	}

	@Override
	public int insert(CustomerBO bo) throws Exception {
		
		int count=0;
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(REALTIME_CUSTOMER_INSERT_QUERY)) {
			//set query param values
			ps.setString(1, bo.getCustName());
			ps.setString(2,bo.getCustAddrs());
			ps.setFloat(3, bo.getpAmt());
			ps.setFloat(4,bo.getTime());
			ps.setFloat(5,bo.getRate());
			ps.setFloat(6, bo.getIntAmt());
			//execute the query
			count=ps.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return count;
	}

}
