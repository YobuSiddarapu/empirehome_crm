package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.AddCustomer;
import com.pageobjects.Loginfunctionality;

public class AddCustomer1 extends Basetest {
	Loginfunctionality Login;
	AddCustomer Add;
	public AddCustomer1() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		Login=new Loginfunctionality();
		Add=new AddCustomer();
		
	}
	@Test
	public void AddnewCustomer() throws Throwable {
		Login.verifylogin();
		Add.AddnewCus();
		String Url=driver.getCurrentUrl();
		Assert.assertEquals(Url,"http://empirehome.myprojectsonline.co.in/User/CustomerData");
		
		
		
		
		
		
		
	}
	@AfterMethod
	public void teardown() {

	}
	
	
	
	
	
	
	
	
	
	

}
