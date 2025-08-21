package org.generics.NavinAutomnDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements ConstantData {
	
	public static WebDriver driver;
	
	ReadData_keyvalue rd=new ReadData_keyvalue();
	public String chromekey=rd.getChromeKey();
	public String chromevalue=rd.getChromeValue();
	

	@BeforeMethod
	public void openingApp() {
    
		System.setProperty(chromekey, chromevalue);
		driver=new ChromeDriver();
		driver.get(appUrl);;
	}
	
	@AfterMethod
	public void closeApp() {
		driver.close();
		
	}

}
