package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginfunctionality;
import com.pageobjects.Logout;

public class Loggingout extends Basetest{
	Loginfunctionality Login;
	Logout Add;
	@BeforeMethod
	public void log() {
		initialization();
		Login=new Loginfunctionality();
		Add=new Logout();
		
	}
	@Test
	public void Logedout() throws Throwable {
		Login.verifylogin();
		Add.Exit();
		
		
	}
	@AfterMethod
	public void teardown() {

	}

}
