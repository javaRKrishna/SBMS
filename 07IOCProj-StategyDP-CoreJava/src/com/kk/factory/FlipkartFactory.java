package com.kk.factory;

import com.kk.comp.BlueDart;
import com.kk.comp.Courier;
import com.kk.comp.DTDC;
import com.kk.comp.Flipkart;

public class FlipkartFactory {
	public static Flipkart getInstance(String courierType) {
		//create Dependent class obj
		Courier courier=null;
		if(courierType.equalsIgnoreCase("dtdc"))
			courier=new DTDC();
		else if(courierType.equalsIgnoreCase("bDart"))
			courier=new BlueDart();
		else
			throw new IllegalArgumentException("Invalid Carier type");
		
		//create Target class obj
		Flipkart fpkt=new Flipkart();
		//assign Dependent class obj to target class obj
		fpkt.setCourier(courier);
		return fpkt;
	}
}
