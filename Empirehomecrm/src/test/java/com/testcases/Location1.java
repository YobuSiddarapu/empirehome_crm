package com.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Location;
import com.pageobjects.Loginfunctionality;

public class Location1 extends Basetest{
	Loginfunctionality Login;
	Location Lo;
	public Location1() {
		super();
	}
@BeforeMethod
public void Add() {
	initialization();
	Login=new Loginfunctionality();
	Lo=new Location();
	
}
@Test
public void Setup() throws Throwable {
	Login.verifylogin();
	Lo.AddLocation1();
	String Url=driver.getCurrentUrl();
	Assert.assertEquals(Url,"http://empirehome.myprojectsonline.co.in/Master/Loctation");
	
}
@AfterMethod
public void teardown() {

}
}
