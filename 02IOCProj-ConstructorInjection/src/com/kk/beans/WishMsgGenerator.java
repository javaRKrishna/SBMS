package com.kk.beans;

import java.util.Date;

public class WishMsgGenerator {
	private Date date;
	
	public WishMsgGenerator() {
		System.out.println("WishMsgGenerator.WishMsgGenerator()::0-param cons");
	}
	
	public void setDate(Date date) {
		System.out.println("WishMsgGenerator.setDate():: setter ()");
		this.date = date;
	}

	public WishMsgGenerator(Date date) {
		System.out.println("WishMsgGenerator.WishMsgGenerator()::1 param cons");
		this.date = date;
	}

	//b.logic
	public String generateWishMsg(String user) {
		System.out.println("WishMsgGenerator.generateWishMsg()"+date);
		//get current hour of the day
		int hour=date.getHours();		//24 hours
		if(hour<12)
			return "Good Morning ::"+user;
		else if(hour<16)
			return "Good Afternoon ::"+user;
		else if(hour<20)
			return "Good Evening ::"+user;
		else 
			return "Good Night ::"+user;
	}//gWM()
}
