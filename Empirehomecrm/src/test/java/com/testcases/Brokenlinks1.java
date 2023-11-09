package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginfunctionality;

public class Brokenlinks1 extends Basetest{
	//Loginfunctionality If;
	
	public Brokenlinks1() {
		super();
	}
	@BeforeMethod
	public void Login() {
		initialization();
		//If=new Loginfunctionality();
		
	}
	@Test
	public void verifytolog() {
	//	If.verifylogin();
		
		
	}
	@AfterMethod
	public void teardown() {
		  extentreports.flush();
		//driver.close();

	}

}
