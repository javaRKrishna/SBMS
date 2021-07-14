package com.kk.comp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dtdc")
//@Scope("prototype")
public class DTDC implements Courier {
	
	public DTDC() {
		System.out.println("DTDC ::0 param cons");
	}
	
	@Override
	public String deliver(int oId) {
		return "Delivering "+oId+" order id order product delivered by DTDC";
	}

}
