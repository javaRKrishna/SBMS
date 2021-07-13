package com.kk.comp;

public class BlueDart implements Courier {
	public BlueDart() {
		System.out.println("BlueDart ::0 param cons");
	}
	
	@Override
	public String deliver(int oId) {
		return "Delivering "+oId+" order id order product delivered by BlueDart";
	}

}
