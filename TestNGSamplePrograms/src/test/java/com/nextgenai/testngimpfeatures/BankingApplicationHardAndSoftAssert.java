package com.nextgenai.testngimpfeatures;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
/*=============================================================================
| Author :  Dhanya Balakrishnan
| Project:  Testing Practices 
| Purpose:  TestNG program for Banking Flow using Hard and Soft Assert Validation 
| Date   :  25/07/2022 
 ===========================================================================*/
public class BankingApplicationHardAndSoftAssert {
	
	
	@Test(priority = 1)
	public void launchApplication() {
		System.out.println("Application is launched");
		Assert.assertEquals("Page Title", "Page Title", "Page Title not same");
	}

			
	@Test(priority = 2)
	public void loginUser() {
		
		SoftAssert softAssert = new SoftAssert();
		System.out.println("Successfully Login into the Application");
		softAssert.assertEquals("Logina", "Login","Login failed");
		softAssert.assertAll();
		
	}

	@Test(priority = 3)
	public void checkSavingAccountBalance() {
		
		SoftAssert softAssert = new SoftAssert();
		System.out.println("Saving Account Balance is Displayed");
		softAssert.assertEquals("Saving Account Balance", "Saving Account Balance", "Not Displayed");
		softAssert.assertAll();
	}

	@Test(priority = 4)
	public void checkCurrentAccountBalance() {
		System.out.println("Current Account Balance is Displayed");
		Assert.assertEquals("Current Account Balance", "Current Account Balance");
	}

	@Test(priority=5)
	public void logout() {
		System.out.println("Log out from the application");
		Assert.assertEquals("Logout", "Logout");
	}

	@Test(priority = 6)
	public void closeApplication() {
		System.out.println("Application is Closed");
		Assert.assertEquals("Closed", "Closed");
	}

	
}
