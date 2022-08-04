package com.nextgenai.beforeafterannotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/*================================================================================================
| Author :  Dhanya Balakrishnan
| Project:  Testing Practices 
| Purpose:  TestNG Program to implement Before and After Method using Screen Navigation Test Case.
| Date   :  19/07/2022 
 =================================================================================================*/
public class ScreenNavigation {
	
	@BeforeMethod
	public void launchApplication() {
		System.out.println("Application is launched");
	}

	@AfterMethod
	public void closeApplication() {
		System.out.println("Application is Closed");
	}

	@Test(priority=1)
	public void navigateRequestDemoPage() {
		System.out.println("Register Demo Page is displayed");
	}
	
	@Test(priority=2)
	public void navigateToAlertandPopup() {
		System.out.println("Alert Popup Page is displayed");
	}

	@Test(priority=3)
	public void navigateToMultipleWindows() {
		System.out.println("Multiple Windows Page is displayed");
	}

	@Test(priority=4)
	public void navigateToWebTable() {
		System.out.println("Web Table Page is displayed");
	}


}
