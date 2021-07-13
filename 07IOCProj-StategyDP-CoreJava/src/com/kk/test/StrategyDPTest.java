package com.kk.test;

import com.kk.comp.Flipkart;
import com.kk.factory.FlipkartFactory;

public class StrategyDPTest {
	public static void main(String[] args) {
		Flipkart fpkt=FlipkartFactory.getInstance("dtdc");
		//invoke b.method
		String result=fpkt.shopping(new String[] {"shirt","trouser","watch"}, 
																new float[] {4000.0f,6000.0f,30000.0f });

	}	
}
