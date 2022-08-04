package com.nextgenai.customizedlisteners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomizedListeners implements  ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test Case Started is "+ result.getName());		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test Case Passed is "+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test Case Failed is "+ result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Test Case Skipped is "+ result.getName());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("Test Case Failed with percentage is "+ result.getName());

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

		System.out.println("Test Case Failed with Timeout is "+ result.getName());

	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("Execution is started ");

	}

	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("Execution is completed");
	}

	
}
