package com.kk.comp;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	private Courier courier;
	
	public Flipkart() {
		System.out.println("Flipkart::0 param cons");
	}
	
	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier=courier;
	}
	
	public String shopping(String[] items,float[] prices) {
		float billAmt=0.0f;
		for (float f : prices)
			billAmt+=f;
			//generate order id
			int oId=new Random().nextInt(1000);
			//use courier
			String msg=courier.deliver(oId);
			return Arrays.toString(items)+" with prices "+Arrays.toString(prices)+" having billAmt "+billAmt+"::: "+msg;
	}
}
