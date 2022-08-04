package com.nextgenai.testngannotations;

import org.testng.annotations.Test;
/*=============================================================================
| Author :  Dhanya Balakrishnan
| Project:  Testing Practices 
| Purpose:  TestNG Program to execute in Alphabetic Order
| Date   :  18/07/2022 
 ===========================================================================*/
public class AlphabeticOrder {

	@Test
	public void z() {
		System.out.println("Method Z is executed");
	}

	@Test
	public void f() {
		System.out.println("Method F is executed");
	}

	@Test
	public void a() {
		System.out.println("Method A is executed");
	}


	@Test
	public void h() {
		System.out.println("Method H is executed");
	}

}
