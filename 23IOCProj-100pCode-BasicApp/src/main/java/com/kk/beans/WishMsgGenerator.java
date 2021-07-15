package com.kk.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMsgGenerator {
	@Autowired
	private LocalDateTime date;
	
	public WishMsgGenerator() {
		System.out.println("WishMsgGenerator 0 param Cons");
	}

	// b.logic
	public String generateWishMsg(String user) {
		// get current hour of the day
		int hour = date.getHour(); // 24 hours
		if (hour < 12)
			return "Good Morning ::" + user;
		else if (hour < 16)
			return "Good Afternoon ::" + user;
		else if (hour < 20)
			return "Good Evening ::" + user;
		else
			return "Good Night ::" + user;
	}// gWM()
}
