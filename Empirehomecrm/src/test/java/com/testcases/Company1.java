package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Company;
import com.pageobjects.Loginfunctionality;

public class Company1 extends Basetest{
	Loginfunctionality Login;
	Company Com;
	public Company1() {
		super();
	}
	@BeforeMethod
	public void add() {
		initialization();
		Login=new Loginfunctionality();
		Com=new Company();
	}
	@Test
	public void Setup() throws Throwable {
		Login.verifylogin();
		Com.Adddetails();
		String Url=driver.getCurrentUrl();
		Assert.assertEquals(Url,"http://empirehome.myprojectsonline.co.in/Master/Company");
	}
	@AfterMethod
	public void teardown() {

	}

}
