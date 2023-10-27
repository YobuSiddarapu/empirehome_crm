package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginfunctionality;
import com.pageobjects.Usertype;

public class Usertype1 extends Basetest {
	Loginfunctionality Login;
	Usertype User;
	
	public Usertype1() {
		super();
	}
	@BeforeMethod
	public void Add() {
		initialization();
		Login=new Loginfunctionality();
		User=new Usertype();
		
	}
	@Test
	public void Setup() throws Throwable {
		Login.verifylogin();
		User.UserFanctionality();
		String Url=driver.getCurrentUrl();
		Assert.assertEquals(Url,"http://empirehome.myprojectsonline.co.in/Master/Usertypes");
	}
	@AfterMethod
	public void teardown() {

	}
	}



