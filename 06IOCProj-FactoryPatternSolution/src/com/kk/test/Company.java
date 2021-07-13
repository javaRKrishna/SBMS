package com.kk.test;

import com.kk.comp.Person;
import com.kk.factory.PersonFactory;

public class Company {
	public static void main(String[] args) {
		Person per=PersonFactory.getPerson("emp");
		per.work();
	}
}
