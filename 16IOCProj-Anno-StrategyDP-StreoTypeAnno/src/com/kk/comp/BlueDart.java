package com.kk.comp;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bDart")
//@Scope("prototype")
@Lazy
public class BlueDart implements Courier {
	public BlueDart() {
		System.out.println("BlueDart ::0 param cons");
	}
	
	@Override
	public String deliver(int oId) {
		return "Delivering "+oId+" order id order product delivered by BlueDart";
	}

}
