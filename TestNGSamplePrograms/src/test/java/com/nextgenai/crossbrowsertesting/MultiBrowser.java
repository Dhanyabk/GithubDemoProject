package com.nextgenai.crossbrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class MultiBrowser {

	public WebDriver driver;

	@Parameters({"browser","url"})

	@BeforeClass
	public void launchApplication(String browser,String url) {

		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();			  
		}

		driver.get(url);
		driver.manage().window().maximize();	
		Reporter.log("Application is launched");

	}
	
	@AfterClass
	public void closeApplication() {
		driver.close();
		Reporter.log("Application is Closed");
	}
	
}
