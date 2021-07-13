package com.kk.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable {
	private String custName;
	private String custAddrs;
	private Float pAmt;
	private Float rate;
	private Float time;
	
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
	public Float getpAmt() {
		return pAmt;
	}
	public void setpAmt(Float pAmt) {
		this.pAmt = pAmt;
	}
	public Float getRate() {
		return rate;
	}
	public void setRate(Float rate) {
		this.rate = rate;
	}
	public Float getTime() {
		return time;
	}
	public void setTime(Float time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "CustomerDTO [custName=" + custName + ", custAddrs=" + custAddrs + ", pAmt=" + pAmt + ", rate=" + rate
				+ ", time=" + time + "]";
	}
	
	
}
