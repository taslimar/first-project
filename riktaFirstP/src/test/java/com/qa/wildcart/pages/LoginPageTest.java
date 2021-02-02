package com.qa.wildcart.pages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.wildcart.base.BasePage;

public class LoginPageTest extends BasePage{
	//testNG--unit testing framework use with java and junit also 
	//preconditions... testcase(steps)..assertion..close test
	//@Beforetest ..@Test...Assertion..close the browser

	LoginPage loginpage;

	@BeforeMethod
	public void setup() {
		DriverSet("chrome");
		loginpage= new LoginPage(driver);
	}
	@Test
	public void verifySignupLink() {
		Assert.assertEquals(loginpage.signBtnExist(), true);
	}
	@Test
	public void verifyPagetitle() {
		String title=loginpage.pageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "WildFire Cart");
	}

	@Test
	public void loginTest() {
		loginpage.doLogin("taslima","abc123");
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
