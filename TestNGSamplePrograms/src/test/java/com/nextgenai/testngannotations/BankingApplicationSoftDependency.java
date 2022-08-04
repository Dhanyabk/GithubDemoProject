package com.nextgenai.testngannotations;

import org.testng.Assert;
import org.testng.annotations.Test;
/*=============================================================================
| Author :  Dhanya Balakrishnan
| Project:  Testing Practices 
| Purpose:  TestNG program for Banking Flow using Soft Dependency  
| Date   :  18/07/2022 
 ===========================================================================*/
public class BankingApplicationSoftDependency {

	@Test
	public void launchApplication() {
		System.out.println("Application is launched");
		Assert.assertEquals("Not Page Title", "Page Title");
	}

	@Test(dependsOnMethods = {"launchApplication"})
	public void loginUser() {
		System.out.println("Successfully Login into the Application");
		Assert.assertEquals("Login", "Not Login");
	}

	@Test(dependsOnMethods = {"loginUser"})
	public void checkSavingAccountBalance() {
		System.out.println("Saving Account Balance is Displayed");
		Assert.assertEquals("Saving Account Balance", "Saving Account Balance");
	}

	@Test(dependsOnMethods = {"checkSavingAccountBalance"})
	public void checkCurrentAccountBalance() {
		System.out.println("Current Account Balance is Displayed");
		Assert.assertEquals("Saving Account Balance", "Saving Account Balance");
	}

	@Test(dependsOnMethods = {"checkCurrentAccountBalance"},alwaysRun=true)
	public void closeApplication() {
		System.out.println("Application is Closed");
		Assert.assertEquals("Closed", "Closed");
	}


}
