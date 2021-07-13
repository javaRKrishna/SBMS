package com.kk.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;
import com.kk.comp.Courier;
import com.kk.comp.Flipkart;

public class FlipkartFactory {
	private static Properties props;
	static {
		try {
			//Locate Properties file
			InputStream is=new FileInputStream("src/com/kk/commons/inputs.properties");
			//load properties file content into java.util.Properties class obj
			props=new Properties();
			props.load(is);
		}catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Flipkart getInstance() {
		try {
			//get Dependent class name from properties file
			String courierClassName=props.getProperty("courier.type");
			//load and create dependent class obj
			Class c=Class.forName(courierClassName);
			//Courier courier=(Courier) c.newInstance();		//deprecate
			Constructor cons[]=c.getDeclaredConstructors();
			Courier courier=(Courier)cons[0].newInstance();
			//create Target class obj
			Flipkart fpkt=new Flipkart();
			//assign Dependent class obj to target class obj
			fpkt.setCourier(courier);
			return fpkt;
		}//try
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}//method
	}//class
}
