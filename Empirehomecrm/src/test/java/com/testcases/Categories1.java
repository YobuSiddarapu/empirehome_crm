package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Categories;
import com.pageobjects.Loginfunctionality;

public class Categories1 extends Basetest{
	Loginfunctionality Login;
	Categories ca;
	
	public Categories1() {
		super();
	}
	@BeforeMethod
	public void Addcat() {
		initialization();
		Login=new Loginfunctionality();
		ca=new Categories();
		
	}
	@Test
	public void Setup() throws Throwable {
		Login.verifylogin();
		ca.Addcategories();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"http://empirehome.myprojectsonline.co.in/Master/Categories");
	}
	@AfterMethod
	public void teardown() {

	}

}
