package com.nextgenai.extentreport;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
 
	
	ExtentSparkReporter spark;
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void startReport() {
		
		spark = new ExtentSparkReporter(System.getProperty("user.dir")+"/ExtentReport/ExecutionReport.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		
	}
	
	@AfterTest
	public void tearDown() {
		extent.flush();
	}
	
	@Test(priority = 1)
	public void launchApplication() {
		
		test = extent.createTest("Test Case 1", "Launch Application Flow");
		test.log(Status.PASS, "Application is launched successfully");
	}
	
	@Test(priority = 2)
	public void failedTestcase() {
		
		test = extent.createTest("Test Case 2", "Launch Application");
		test.log(Status.FAIL, "Application failed");
	}
	
	@Test(priority = 3)
	public void wariningTestcase() {
		
		test = extent.createTest("Test Case 3", "Launch Application");
		test.log(Status.WARNING, "Application has warning");
	}
	
	@Test(priority = 4)
	public void skippingTestcase() {
		
		test = extent.createTest("Test Case 4", "Launch Application");
		test.log(Status.SKIP, "Application is skipped");
	}
	
	@Test(priority = 5)
	public void informationTestcase() {
		
		test = extent.createTest("Test Case 5", "Launch Application");
		test.log(Status.INFO, "For information");
	}

}
