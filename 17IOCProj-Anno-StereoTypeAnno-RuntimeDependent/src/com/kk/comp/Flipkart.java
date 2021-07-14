package com.kk.comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("fpkt")
@Component
@Scope
@Lazy
//@PropertySource(value={"com/kk/commons/info.properties","com/kk/commons/info.properties"})
@PropertySource({"com/kk/commons/info.properties","com/kk/commons/info.properties"})
public class Flipkart {

	@Autowired(required = true)
	//@Qualifier("bDart")
	//@Qualifier("${courier.id}")
	@Qualifier("cr")
	private Courier courier;
	
	@Value("${my.name}")
	private String name;
	
	@Value("${os.name}")
	private String os;
	
	@Value("${Path}")
	private String path;
	
	public Flipkart() {
		System.out.println("Flipkart::0 param cons");
	}
	
	public String shopping(String[] items, float[] prices) {
		System.out.println(name);
		System.out.println(courier);
		System.out.println(os);
		System.out.println(path);
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
