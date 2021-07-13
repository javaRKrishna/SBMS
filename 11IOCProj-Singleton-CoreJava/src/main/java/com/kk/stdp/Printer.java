package com.kk.stdp;

public class Printer {
	//static reference variable
	private static Printer INSTANCE;
	
	//private Constructor
	private Printer() {
		System.out.println("Printer :: 0 param cons");
	}
	
	//public static factory method
	public static Printer getInstance() {
		if(INSTANCE==null)
			INSTANCE= new Printer();
		return INSTANCE;
	}
}
