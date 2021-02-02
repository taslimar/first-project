package com.qa.wildcart.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.wildcart.base.BasePage;

public class RegistrationPageTest extends BasePage {
    WebDriver        driver;
    BasePage         basepage;
    LoginPage        loginpage;
    RegistrationPage registrationpage;
  
    @BeforeTest
    
    public void setup() {
    	basepage = new BasePage();
    	driver= basepage.DriverSet("chrome");
    	loginpage=new LoginPage(driver);
    	registrationpage=loginpage.dosignup();
    	
     }
    @Test
    
    public void registrationTest() {
    	registrationpage.accountRegistration("taslima_rikta@yahoo.com", "taslima", "abc123", "abc123", "taslima", "rikta", "139 briarwood");
    	
    	}
    
   @AfterTest
    public void closeBrowser() {
    	driver.quit();
    }
	
	
}

