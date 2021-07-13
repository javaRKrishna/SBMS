package com.kk.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kk.controller.MainController;
import com.kk.vo.CustomerVO;

public class CustomerAppTest {
	public static void main(String[] args) {
		//read input values
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Customer Name :");
		String name=scn.nextLine();
		System.out.println("Enter Customer Addrs :");
		String addrs=scn.nextLine();
		System.out.println("Enter  PA :");
		String pAmt=scn.nextLine();
		System.out.println("Enter  Rate :");
		String rate=scn.nextLine();
		System.out.println("Enter  Time :");
		String time=scn.nextLine();
		
		//create CustomerVO class obj
		CustomerVO vo=new CustomerVO();
		vo.setCustName(name);
		vo.setCustAddrs(addrs);
		vo.setpAmt(pAmt);
		vo.setRate(rate);
		vo.setTime(time);
		//create IOC Container
		 //create IOC Container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/kk/cfgs/applicationContext.xml");
		//get Controller class obj
		MainController controller=ctx.getBean("controller",MainController.class);
		//invoke the methods
		try {
			String result=controller.processCustomer(vo);
			System.out.println(result);
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Internal Problem-- Try Agin");
		}
	}
}
