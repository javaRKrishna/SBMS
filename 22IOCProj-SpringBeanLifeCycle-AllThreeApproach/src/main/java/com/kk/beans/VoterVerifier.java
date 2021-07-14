package com.kk.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("voter")
public class VoterVerifier implements InitializingBean,DisposableBean{
	@Value("${name}")
	private String name;
	@Value("${age}")
	private float age;
	private Date verificationDate;
	
	public VoterVerifier() {
		System.out.println("VoterVerifier.0 param cons");
	}

	public void setName(String name) {
		System.out.println("VoterVerifier.setName()");
		this.name = name;
	}
	
	public void setAge(float age) {
		System.out.println("VoterVerifier.setAge()");
		this.age = age;
	}

	public void setVerificationDate(Date verificationDate) {
		System.out.println("VoterVerifier.setVerificationDate()");
		this.verificationDate = verificationDate;
	}


	public String checkVotingEligibility() {
		if(age<18)
			return "Mr/Miss/Mrs. "+name+" u r not eligible for voting wait "+(18-age)+" years to cast u r vote";
		else
			return "Mr/Miss/Mrs. "+name+" u r eligible for voting";
	}

//Declarative Approach
	
	//init life cycle method
		public void myInit() {
			System.out.println("Custome init method/Declarative");
			verificationDate=new Date();  	//initializing bean property that is not participating injection
			//validation
			if(name==null || age<=0)
				throw new IllegalArgumentException("invalid inputs are given for name , age properties");
		}
		
		//destroy method
		public void myDestroy() {
			System.out.println("VoterVerifier.myDestroy()/Declarative");
			name=null;
			age=0;
			verificationDate=null;
		}
		
//Programatic Approach
		@Override
		public void destroy() throws Exception {
			System.out.println("VoterVerifier.destroy()/Programatic");
			name=null;
			age=0;
			verificationDate=null;
		}

		@Override
		public void afterPropertiesSet() throws Exception {
			System.out.println("VoterVerifier.afterPropertiesSet()/Programatic");
			verificationDate=new Date();  	//initializing bean property that is not participating injection
			//validation
			if(name==null || age<=0)
				throw new IllegalArgumentException("invalid inputs are given for name , age properties");
		}
		
//Annotation Approach
		
	@PreDestroy
	public void destroyAnno() throws Exception {
		System.out.println("VoterVerifier.destroy()/Annotation");
		name=null;
		age=0;
		verificationDate=null;
	}
	
	@PostConstruct
	public void inti() throws Exception {
		System.out.println("VoterVerifier.init()/Annotation");
		verificationDate=new Date();  	//initializing bean property that is not participating injection
		//validation
		if(name==null || age<=0)
			throw new IllegalArgumentException("invalid inputs are given for name , age properties");
	}
	
	
	
}	
