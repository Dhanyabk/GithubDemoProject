package com.nextgenai.grouping;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NextGenAISuite {

	@BeforeSuite(groups= {"Smoke","Sanity","Regression"})
	public void launchApplication() {
		System.out.println("Application is Launched Successfully");
	}

	@AfterSuite(groups= {"Smoke","Sanity","Regression"})
	public void closeApplication() {
		System.out.println("Application is closed");
	}

	@Test(groups= {"Smoke","Sanity","Regression"},priority=1)
	public void navigateToPythonForDataScience() {
		System.out.println("Basics Python page is displayed");
	}


	@Test(groups= {"Smoke","Sanity","Regression"},priority=2)
	public void navigateToRegistrationForm() {
		System.out.println("Register for Demo page is displayed");
	}

	@Test(groups= {"Smoke","Sanity","Regression"},priority=3)
	public void registerForDemo() {
		System.out.println("Registerd for Automation Demo");
	}


	@Test(groups= {"Sanity","Regression"},priority=4)
	public void navigateToAutomationWindow() {
		System.out.println("Practice Automation Windows page is displayed");
	}

	@Test(groups= {"Sanity","Regression"},priority=5)
	public void handleNewMessageWindow() {
		System.out.println("Window Messages handled successfully");
	}

	@Test(groups= {"Regression"},priority=6)
	public void handleNewBrowserWindow() {
		System.out.println("Multiple Windows handled successfully");
	}

	@Test(groups= {"Regression"},priority=7)
	public void handleNewTab() {
		System.out.println("Multiple Tabs handled successfully");
	}

	@Test(groups= {"Sanity","Regression"},priority=8)
	public void navigateToAutomationAlertPopup() {
		System.out.println("Practice Automation Alert Popup page is displayed");
	}

	@Test(groups= {"Sanity","Regression"},priority=9)
	public void handleConfirmAlertPopup() {
		System.out.println("Confirmation Alert Popup handled successfully");
	}

	@Test(groups= {"Regression"},priority=10)
	public void handleAlertPopup() {
		System.out.println("Alert Popup handled successfully");
	}


	@Test(groups= {"Regression"},priority=11)
	public void handlePromptPopup() {
		System.out.println("Prompt Popup handled successfully");
	}

	@Test(groups= {"Regression"},priority=12)
	public void navigateToAutomationTable() {
		System.out.println("Practice Automation Table page is displayed");
	}


	@Test(groups= {"Regression"},priority=13)
	public void extractEmployeeDetails() {
		System.out.println("All the Employee details extracted");
	}



}
