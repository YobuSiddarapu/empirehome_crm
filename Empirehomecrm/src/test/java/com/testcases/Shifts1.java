package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginfunctionality;
import com.pageobjects.Shifts;

public class Shifts1 extends Basetest{
	Loginfunctionality Login;
	Shifts Sh;
	public Shifts1() {
		super();
	}
	@BeforeMethod
	public void Add() {
		initialization();
		Login=new Loginfunctionality();
		Sh=new Shifts();
		
	}
	@Test
	public void Setup() throws Throwable {
		Login.verifylogin();
		Sh.Addshifts();
		String Url=driver.getCurrentUrl();
		Assert.assertEquals(Url,"http://empirehome.myprojectsonline.co.in/Master/Shifts");
	}
	@AfterMethod
	public void teardown() {

	}
}
