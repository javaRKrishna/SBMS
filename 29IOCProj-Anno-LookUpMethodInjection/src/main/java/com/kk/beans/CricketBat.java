package com.kk.beans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class CricketBat {
	
	public CricketBat() {
		System.out.println("CricketBat.0 param");
	}
	public int scoreRuns() {
		System.out.println("CricketBat.scoreRuns()");
		return new Random().nextInt(200);
	}
}
 