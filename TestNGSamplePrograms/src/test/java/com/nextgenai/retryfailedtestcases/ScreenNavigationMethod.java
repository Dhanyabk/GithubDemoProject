package com.nextgenai.retryfailedtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*=============================================================================
| Author :  Dhanya Balakrishnan
| Project:  Testing Practices 
| Purpose:  TestNG program for implementing retryfailed testcases
| Date   :  26/07/2022 
 ===========================================================================*/
public class ScreenNavigationMethod  {

	public WebDriver driver;

	//Storing the locator values
	String qaAutomationLocator = "QA AUTOMATION";
	String practiseAutomationLocator = "Practice Automation";
	String registrationFormLocator = "Registration Form";

	@BeforeClass
	public void launchAppliction() {

		// To Set System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		// To Create Driver Object 
		driver = new ChromeDriver();

		// Launch the Home URL
		driver.get("https://nxtgenaiacademy.com/");

		// To Maximize Window
		driver.manage().window().maximize();
		System.out.println("Application is launched");

	}

	@AfterClass(alwaysRun = true)
	public void closeApplication() {
		driver.close();
		System.out.println("Application is closed");
	}

	@Test(priority=1)
	public void navigateToRegistrationForm() {

		// Create an Instance in Action Class by passing webdriver instance
		Actions action = new Actions(driver);

		//Performing the mouse hover action on the qaAutomation
		WebElement qaAutomation = driver.findElement(By.linkText(qaAutomationLocator));
		action.moveToElement(qaAutomation).perform();

		//Performing the mouse hover action on the practiceAutomation
		WebElement pracAutomation = driver.findElement(By.linkText(practiseAutomationLocator));
		action.moveToElement(pracAutomation).perform();

		// Click on Registration Form 
		WebElement registrationForm = driver.findElement(By.partialLinkText(registrationFormLocator));
		registrationForm.click();
		System.out.println("Navigated to Register Demo Page");
	}

	@Test(priority=2, retryAnalyzer = MyRetry.class)
	public void navigateToAlertandPopup() {

		// Create an Instance in Action Class by passing webdriver instance
		Actions action = new Actions(driver);

		//Performing the mouse hover action on the qaAutomation
		WebElement qaAutomation = driver.findElement(By.linkText(qaAutomationLocator));
		action.moveToElement(qaAutomation).perform();

		//Performing the mouse hover action on the practiceAutomation
		WebElement pracAutomation = driver.findElement(By.linkText(practiseAutomationLocator));
		action.moveToElement(pracAutomation).perform();

		// Click on Registration Form 
		WebElement registrationForm = driver.findElement(By.partialLinkText("Aler And Popup"));
		registrationForm.click();
		System.out.println("Navigated to Alert Popup Page");

	}

	@Test(priority=3)
	public void navigateToMultipleWindows() {


		// Create an Instance in Action Class by passing webdriver instance
		Actions action = new Actions(driver);

		//Performing the mouse hover action on the qaAutomation
		WebElement qaAutomation = driver.findElement(By.linkText(qaAutomationLocator));
		action.moveToElement(qaAutomation).perform();

		//Performing the mouse hover action on the practiceAutomation
		WebElement pracAutomation = driver.findElement(By.linkText(practiseAutomationLocator));
		action.moveToElement(pracAutomation).perform();

		// Click on Registration Form 
		WebElement registrationForm = driver.findElement(By.partialLinkText("Multiple Windows"));
		registrationForm.click();
		System.out.println("Navigated to Multiple Windows Page");

	}
	@Test(priority=4)
	public void navigateToWebTable() {


		// Create an Instance in Action Class by passing webdriver instance
		Actions action = new Actions(driver);

		//Performing the mouse hover action on the qaAutomation
		WebElement qaAutomation = driver.findElement(By.linkText(qaAutomationLocator));
		action.moveToElement(qaAutomation).perform();

		//Performing the mouse hover action on the practiceAutomation
		WebElement pracAutomation = driver.findElement(By.linkText(practiseAutomationLocator));
		action.moveToElement(pracAutomation).perform();

		// Click on Registration Form 
		WebElement registrationForm = driver.findElement(By.partialLinkText("WebTable"));
		registrationForm.click();
		System.out.println("Navigated to Web Table Page ");

	}

}
