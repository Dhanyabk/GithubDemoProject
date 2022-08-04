package com.nextgenai.testngannotations;

import org.testng.annotations.Test;
/*=============================================================================
| Author :  Dhanya Balakrishnan
| Project:  Testing Practices 
| Purpose:  TestNG Program to ignore test case.
| Date   :  18/07/2022 
 ===========================================================================*/
public class BankingApplication {

	@Test(priority = 1)
	public void launchApplication() {
		System.out.println("Application is launched");
	}

	@Test(priority = 2)
	public void loginUser() {
		System.out.println("Successfully Login into the Application");
	}


	@Test(priority = 3)
	public void checkSavingAccountBalance() {
		System.out.println("Saving Account Balance is Displayed");
	}

	@Test(priority = 4, enabled = false)
	public void checkCurrentAccountBalance() {
		System.out.println("Current Account Balance is Displayed");
	}
	
	@Test(priority=5)
	public void logout() {
		System.out.println("Log out from the application");
	}

	@Test(priority = 6)
	public void closeApplication() {
		System.out.println("Application is Closed");
	}

}
