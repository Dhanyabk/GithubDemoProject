package com.nextgenai.testngannotations;

import org.testng.Assert;
import org.testng.annotations.Test;
/*=============================================================================
| Author :  Dhanya Balakrishnan
| Project:  Testing Practices 
| Purpose:  TestNG program for Banking Flow using Assert Validation 
| Date   :  18/07/2022 
 ===========================================================================*/
public class BankingApplicationAssertValidation {
	@Test(priority = 1)
	public void launchApplication() {
		System.out.println("Application is launched");
		Assert.assertEquals("Page Title", "Page Title");
	}

	@Test(priority = 2)
	public void loginUser() {
		System.out.println("Successfully Login into the Application");
		Assert.assertEquals("Login", "Login");
	}


	@Test(priority = 3)
	public void checkSavingAccountBalance() {
		System.out.println("Saving Account Balance is Displayed");
		Assert.assertEquals("Not Saving Account Balance", "Saving Account Balance");

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
