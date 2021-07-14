package com.kk.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("voter")
public class VoterVerifier{
	@Value("${name}")
	private String name;
	@Value("${age}")
	private float age;
	private Date verificationDate;
	
	public VoterVerifier() {
		System.out.println("VoterVerifier.VoterVerifier()");
	}
	
	public String checkVotingEligibility() {
		if(age<18)
			return "Mr/Miss/Mrs. "+name+" u r not eligible for voting wait "+(18-age)+" years to cast u r vote";
		else
			return "Mr/Miss/Mrs. "+name+" u r eligible for voting";
	}

	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("VoterVerifier.destroy()");
		name=null;
		age=0;
		verificationDate=null;
	}
	
	@PostConstruct
	public void inti() throws Exception {
		System.out.println("VoterVerifier.init()");
		verificationDate=new Date();  	//initializing bean property that is not participating injection
		//validation
		if(name==null || age<=0)
			throw new IllegalArgumentException("invalid inputs are given for name , age properties");
	}
	
	
	
}	
