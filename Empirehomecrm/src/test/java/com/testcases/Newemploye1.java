package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginfunctionality;
import com.pageobjects.NewEmploye;

public class Newemploye1 extends Basetest{
	Loginfunctionality Login;
	NewEmploye Add;
	public Newemploye1() {
		super();
		
	}
	@BeforeMethod
	public void Setup() {
		initialization();
		Login=new Loginfunctionality();
		Add=new NewEmploye();
		
		
	}
	@Test
	public void AddnewEmployee()throws Throwable {
		Login.verifylogin();
		Add.Addemploye1();
		String Url=driver.getCurrentUrl();
		Assert.assertEquals(Url,"http://empirehome.myprojectsonline.co.in/Staff/AddNewStaff");
	}
	@AfterMethod
	public void teardown() {

	}
	
	
	

}
