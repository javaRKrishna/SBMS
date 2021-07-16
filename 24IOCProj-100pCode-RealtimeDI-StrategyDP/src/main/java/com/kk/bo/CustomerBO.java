package com.kk.bo;

public class CustomerBO {
	private String custName;
	private String custAddrs;
	private Float pAmt;
	private Float rate;
	private Float time;
	private Float intAmt;
	
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
	public Float getIntAmt() {
		return intAmt;
	}
	public void setIntAmt(Float intAmt) {
		this.intAmt = intAmt;
	}
	@Override
	public String toString() {
		return "CustomerBO [custName=" + custName + ", custAddrs=" + custAddrs + ", pAmt=" + pAmt + ", rate=" + rate
				+ ", time=" + time + ", intAmt=" + intAmt + "]";
	}
}
