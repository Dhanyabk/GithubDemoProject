package com.nextgenai.testngimpfeatures;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*=============================================================================
| Author :  Dhanya Balakrishnan
| Project:  Testing Practices 
| Purpose:  Program to capture screenshot
| Date   :  25/07/2022 
 ===========================================================================*/
public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {

		// To Set System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		// To Create Driver Object in Driver Interface
		WebDriver driver = new ChromeDriver();

		// Launch the Home URL
		driver.get("https://nxtgenaiacademy.com/demo-site/");

		// To Maximize Window
		driver.manage().window().maximize();

		// Taking Screenshot 
		TakesScreenshot scrShot = ((TakesScreenshot)driver);//similar to print screen

		// Call getScreenshotAs method to create image file
		File file = scrShot.getScreenshotAs(OutputType.FILE);

		// Copy file to Desired Location
		FileUtils.copyFile(file, new File(".\\Screenshot\\HomePage.jpg"));

		//Screenshot for failure condition
		try {
			// name locator value is wrong 
			driver.findElement(By.name("vfb-submittt")).click();

		}
		catch(Throwable e) {

			File file2 = scrShot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file2, new File(".\\ScreenShot\\ErrorPage.jpg"));

		}

		// Close the Application
		driver.close();

	}

}
