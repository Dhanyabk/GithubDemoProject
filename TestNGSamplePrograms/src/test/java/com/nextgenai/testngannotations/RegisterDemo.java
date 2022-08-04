package com.nextgenai.testngannotations;

import org.testng.annotations.Test;
/*=============================================================================
| Author :  Dhanya Balakrishnan
| Project:  Testing Practices 
| Purpose:  TestNG Program using Priority  
| Date   :  18/07/2022 
 ===========================================================================*/
public class RegisterDemo {

	@Test(priority=1)
	public void lauchApplication() {
		System.out.println("Application is launched");
	}

	@Test(priority=2)
	public void navigateToRegistrationForm() {
		System.out.println("Registration Form Page is displayed");
	}

	@Test(priority=3)
	public void registerForDemo() {
		System.out.println("User is Registered");
	}

	@Test(priority=4)
	public void closeApplication() {
		System.out.println("Application is Closed");
	}

}
