package org.scripts.NavinAutomnDemo;

import java.io.IOException;

import org.generics.NavinAutomnDemo.BaseTest;
import org.generics.NavinAutomnDemo.ConstantData;
import org.generics.NavinAutomnDemo.ReadData_credentials;
import org.pages.NavinAutomnDemo.SwagLab;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(org.generics.NavinAutomnDemo.Utility_screenshot.class)
public class ValidLogin extends BaseTest implements ConstantData {
	
	@Test
	public void verifySwagLabValidLogin() throws IOException, InterruptedException {
		SwagLab sl = new SwagLab(driver);
		
		sl.setUsername(ReadData_credentials.getCellData(excelDirec, sheetName, 1, 0));
		
		sl.setPassword(ReadData_credentials.getCellData(excelDirec, sheetName, 1, 1));
		String acualTtle=driver.getTitle();
		//assert.equals(acualTtle,"Swag Labs");
		if(acualTtle.equalsIgnoreCase("Swag Labs"))
		{
			System.out.println("ValidLogin: "+"Pass");
		}
	}

}
