package com.kk.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kk.beans.VoterVerifier;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/kk/cfgs/applicationContext.xml");
		//get Spring bean object
		VoterVerifier voter=ctx.getBean(VoterVerifier.class);
		//invoke method
		try {
			System.out.println(voter.checkVotingEligibility());
		}catch (Exception e) {
			e.printStackTrace();
		}
		//close container
		ctx.close();
	}
}
