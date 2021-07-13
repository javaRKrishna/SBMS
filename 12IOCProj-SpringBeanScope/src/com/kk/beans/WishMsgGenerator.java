package com.kk.beans;

import java.util.Date;

public class WishMsgGenerator {
	private Date date;

	//setter method
	public void setDate(Date date) {
		System.out.println("WishMsgGenerator.setDate()");
		this.date = date;
	}

	//b.logic
	public String generateWishMsg(String user) {
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
