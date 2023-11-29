package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginfunctionality;
import com.pageobjects.Staffattendence;

public class attendence1 extends Basetest {
	Loginfunctionality Login;
	Staffattendence Staff;
	public attendence1() {
		super();
	}
	@BeforeMethod
	public void setup() {
		initialization();
		Login=new Loginfunctionality();
		Staff=new Staffattendence();
		
	}
	@Test
	public void set() throws Throwable {
		Login.verifylogin();
		Staff.Markattendence();
	}
	@AfterMethod
	public void teardown() {
		
	}


}
