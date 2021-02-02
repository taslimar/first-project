package com.qa.wildcart.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	    public WebDriver driver;
	    public Properties prop;
	    
	public  WebDriver DriverSet(String browser) {
		System.out.println("browser name"+ browser );
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();	
		
	}else if (browser.equalsIgnoreCase("safari")) {
		WebDriverManager.getInstance((SafariDriver.class)).setup();
		driver=new SafariDriver();	
		
	}else {
		System.out.println("browser not found");
	}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.demo.iscripts.com/multicart/demo/index.php");
		return driver;
	}
	
	public Properties init_prop () throws IOException {
		prop= new Properties();
		try {
			FileInputStream ip= new FileInputStream("C:\\Users\\Masud\\eclipse-workspace\\riktaFirstP\\src\\main\\java\\com\\qa\\wildcart\\properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}
	

}
