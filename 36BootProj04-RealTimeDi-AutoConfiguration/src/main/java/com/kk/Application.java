package com.kk;

import java.io.Closeable;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.kk.controller.MainController;
import com.kk.vo.EmployeeVO;

//To disbale autoConfiguration
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,JdbcTemplateAutoConfiguration.class})
//@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//read inputs from endUser
		Scanner scn=new Scanner(System.in);
		System.out.println("Desgs Count:: ");
		int count=scn.nextInt();
		String desgs[]=null;
		if(count>=1)
			desgs=new String[count];
		else {
			System.out.println("Invalid desg count");
			return;
		}
		for (int i = 0; i < count; i++) {
			System.out.println("Enter Desg:: "+i);
			String desg=scn.next();
			desgs[i]=desg;
		}
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(Application.class, args);
		//get controller class obj
		MainController controller=ctx.getBean(MainController.class);
		//invoke b.method
		try {
			List<EmployeeVO> listVO=controller.showEmpsByDesgs(desgs);
			listVO.forEach(vo->{
				System.out.println(vo);
			});
		}//try
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Some Internal Problem::"+e.getMessage());
		}
		//close Container
		((ConfigurableApplicationContext) ctx).close();
	}

}
