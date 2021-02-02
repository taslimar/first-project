package com.qa.wildcart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.wildcart.base.BasePage;

public class LoginPage extends BasePage {
	
	By logBtn     = By.id("dLabellogin");
	By un         = By.id("username");
	By pass       = By.id("password");
	By logButton  = By.id("jqLogin");
	By signUp     = By.id("jqSignup");
	//constructor of the page class
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	//page action
	public String pageTitle() {
		return driver.getTitle();
	}
    public boolean signBtnExist() {
    	driver.findElement(logBtn).click();
    	return driver.findElement(signUp).isDisplayed();
    	
    }
    public void doLogin(String UserName, String Password) {
    	driver.findElement(logBtn).click();
    	driver.findElement(un).sendKeys(UserName);
    	driver.findElement(pass).sendKeys(Password);
    	driver.findElement(logButton).click();
    }
    public RegistrationPage dosignup() {
    	driver.findElement(logBtn).click();
    	driver.findElement(signUp).click();
    	return new RegistrationPage(driver);
    }
}
