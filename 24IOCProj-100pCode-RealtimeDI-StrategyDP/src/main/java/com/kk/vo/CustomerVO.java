package com.kk.vo;


public class CustomerVO{
	private String custName;
	private String custAddrs;
	private String pAmt;
	private String rate;
	private String time;

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}


	public String getCustAddrs() {
		return custAddrs;
	}


	public void setCustAddrs(String custAddrs) {
		this.custAddrs = custAddrs;
	}


	public String getpAmt() {
		return pAmt;
	}


	public void setpAmt(String pAmt) {
		this.pAmt = pAmt;
	}


	public String getRate() {
		return rate;
	}


	public void setRate(String rate) {
		this.rate = rate;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	@Override
	public String toString() {
		return "CustomerVO [custName=" + custName + ", custAddrs=" + custAddrs + ", pAmt=" + pAmt + ", rate=" + rate
				+ ", time=" + time + "]";
	}
	
	
}
