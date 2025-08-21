package org.generics.NavinAutomnDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Utility_screenshot  implements ITestListener {
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed: " + result.getName());
		TakesScreenshot ts=(TakesScreenshot)BaseTest.driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("./Screenshot/failtedtestscript.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	/*
	 * public void onTestStart(ITestResult result) {
	 * System.out.println("Test Started: " + result.getName()); }
	 * 
	 * public void onTestSuccess(ITestResult result) {
	 * System.out.println("Test Passed: " + result.getName()); }
	 * 
	 * public void onTestSkipped(ITestResult result) { }
	 * 
	 * public void onTestFailedButWithinSuccessPercentage(ITestResult result) { }
	 */
		/*
		 * public void onStart(ITestContext context) {}
		 * 
		 * public void onFinish(ITestContext context) {}
		 */
}
