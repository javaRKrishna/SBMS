package com.kk.comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("fpkt")
@Component
@Scope
@Lazy
public class Flipkart {

	@Autowired(required = true)
	@Qualifier("bDart")
	private Courier courier;

	public Flipkart() {
		System.out.println("Flipkart::0 param cons");
	}
	
	public String shopping(String[] items, float[] prices) {
		System.out.println(courier);
		float billAmt = 0.0f;
		for (float f : prices)
			billAmt += f;
		// generate order id
		int oId = new Random().nextInt(1000);
		// use courier
		String msg = courier.deliver(oId);
		return Arrays.toString(items) + " with prices " + Arrays.toString(prices) + " having billAmt " + billAmt
				+ "::: " + msg;
	}
}
