package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Condition;
import com.pageobjects.Loginfunctionality;

public class Condition1 extends Basetest {
	Loginfunctionality Login;
	Condition co;
	public Condition1() {
		super();
		
		
	}
	@BeforeMethod
	public void Add() {
		initialization();
		Login =new Loginfunctionality();
		co=new Condition();
		
	}
	@Test
	public void Setup() throws Throwable {
		Login.verifylogin();
		co.AddCondition();
		String Url=driver.getCurrentUrl();
		Assert.assertEquals(Url,"http://empirehome.myprojectsonline.co.in/Master/Condition");
		
	}
	@AfterMethod
	public void teardown() {

	}

}
