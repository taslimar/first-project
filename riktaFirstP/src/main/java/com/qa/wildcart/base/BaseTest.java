package com.qa.wildcart.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.qa.wildcart.pages.LoginPage;

public class BaseTest {
public WebDriver	driver;
public BasePage basepage;
public LoginPage loginpage;
public Properties prop;
	

public void setup() {
	basepage = new BasePage()	;
	
}
}
