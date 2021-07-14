package com.kk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.kk.bo.CustomerBO;

@Repository("custOraDAO")
public class CustomerOracleDAOImpl implements ICustomerDAO {
	private static final String REALTIME_CUSTOMER_INSERT_QUERY="INSERT INTO REALTIMEDI_CUSTOMER VALUES(CNO_SEQ.NEXTVAL,?,?,?,?,?,?)";
	
	@Autowired
	@Qualifier("dmds")
	private DataSource ds;
	
	@Override
	public int insert(CustomerBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		try {
			//get pooled jdbc con object
			con=ds.getConnection();
			//create PreparedStatement obj having pre-compiled SQL query
			ps=con.prepareStatement(REALTIME_CUSTOMER_INSERT_QUERY);
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
		finally {
			if(con!=null)
				con.close();
		}
		return count;
	}

}
