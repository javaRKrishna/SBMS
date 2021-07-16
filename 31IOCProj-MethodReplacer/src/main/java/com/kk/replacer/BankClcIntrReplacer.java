package com.kk.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class BankClcIntrReplacer implements MethodReplacer{

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("BankClcIntrReplacer.reimplement()");
		double amt=(double) args[0];
		double rate=(double) args[1];
		double time=(double) args[2];
		//calculate SI amount
		return (amt*rate*time)/100;
	}

}
