package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Holiday;
import com.pageobjects.Loginfunctionality;

public class Holiday1 extends Basetest{
	Loginfunctionality Login;
	Holiday Add;
	public Holiday1() {
		super();
	}
	
	@BeforeMethod
	public  void Setup() {
		initialization();
		Login=new Loginfunctionality();
		Add=new Holiday();
	}
	
	@Test
	public void Addholiday() throws Throwable {
		Login.verifylogin();
		Add.HolidayFactory();
		String Url=driver.getCurrentUrl();
		Assert.assertEquals(Url, "http://empirehome.myprojectsonline.co.in/Master/HolidayTypedata");
		
	}
	@AfterMethod
	public void teardown() {

	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
