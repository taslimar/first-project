package com.qa.wildcart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.wildcart.base.BasePage;


public class RegistrationPage extends BasePage{
	private WebDriver driver;
	By emailField= By.xpath("//input[@id='txtEmail']");
	By regUserName= By.xpath("//input[@id='txtUserName']");
    By regPass    = By.xpath("//input[@id='txtPassword']");
    By regPassConf = By.xpath("//input[@id='txtCnfPassword']");
    By regFirstName = By.xpath("//input[@id='txtFirstName']");
    By regLastName  = By.xpath("//input[@id='txtLastName']");
    By regAddress = By.xpath("//input[@placeholder='Address *']");
    By regCreatbtn= By.xpath("//input[@id='btnRegister']");
    

     public RegistrationPage(WebDriver driver) {
    	 this.driver= driver;
     }
     public void accountRegistration(String email, String username,
    		 String pass, String conpass, String fname, String lname, String address) {
    	 
    	driver.findElement(emailField).sendKeys(email);
    	driver.findElement(regUserName).sendKeys(username);
    	driver.findElement(regPass).sendKeys(pass);
    	driver.findElement(regPassConf).sendKeys(conpass);
    	driver.findElement(regFirstName).sendKeys(fname);
    	driver.findElement(regLastName).sendKeys(lname);
    	driver.findElement(regAddress).sendKeys(address);
    	driver.findElement(regCreatbtn).click();
     }  
   
     
     
}
