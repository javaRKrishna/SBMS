package com.kk.comp;

public class DTDC implements Courier {
	public DTDC() {
		System.out.println("DTDC ::0 param cons");
	}
	
	@Override
	public String deliver(int oId) {
		return "Delivering "+oId+" order id order product delivered by DTDC";
	}

}
