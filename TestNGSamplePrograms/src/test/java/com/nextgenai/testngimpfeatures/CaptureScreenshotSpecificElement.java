package com.nextgenai.testngimpfeatures;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*=============================================================================
| Author :  Dhanya Balakrishnan
| Project:  Testing Practices 
| Purpose:  Program to capture screenshot of specific element
| Date   :  25/07/2022 
 ===========================================================================*/
public class CaptureScreenshotSpecificElement {

	public static void main(String[] args) throws IOException {
		
		// Set the system property for the chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Creating instance of Chrome driver
		WebDriver driver = new ChromeDriver();

		//Storing the Application Url in the String variable 
		String url = "https://nxtgenaiacademy.com/demo-site/";
		
		// Launch the application
		driver.get(url);

		// Maximize the application
		driver.manage().window().maximize();
		
		// Declaring the WebElement object
		WebElement robotImage = driver.findElement(By.xpath("//img[@alt='Automation']"));

		// Taking Screenshot of particular webelement
		// Call getScreenshotAs method to create image file		
		File file = robotImage.getScreenshotAs(OutputType.FILE);

		// Copy file to Desired Location
		FileUtils.copyFile(file, new File(".\\ScreenShot\\RobotImage.jpg"));	
		
		// Close the application
		driver.close();

	}

}
