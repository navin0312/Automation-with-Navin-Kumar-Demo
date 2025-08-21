package org.generics.NavinAutomnDemo;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadData_keyvalue {
	public Properties pro;

//initialization 
	
	public ReadData_keyvalue() {
		try {
			FileInputStream fis = new FileInputStream("./Configuration/Data_keyvalue.properties");
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception msg :" + e.getMessage());

		}
	}
	
//utilization

	public String getChromeKey() {
		String chromekey = pro.getProperty("chromekey");
		return chromekey;

	}
	public String getChromeValue() {
		String chromevalue= pro.getProperty("chromevalue");
		return chromevalue;
	}
}
