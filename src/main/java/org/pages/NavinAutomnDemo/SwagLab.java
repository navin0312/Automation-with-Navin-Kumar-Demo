package org.pages.NavinAutomnDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLab {
	//declaration
	@FindBy(xpath="//input[@placeholder='Username']")
	private WebElement UsernameTestfield;
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement PasswordTextfield;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement Loginbtn;
	
	//initialization
	public SwagLab(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	//utilization
	public void setUsername(String Username) {
		UsernameTestfield.sendKeys(Username);
	}
	public void setPassword(String Password) {
		PasswordTextfield.sendKeys(Password);
	}
	public void clickLogin() {
		Loginbtn.click();
	}

}
