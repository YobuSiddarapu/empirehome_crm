package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginfunctionality;
import com.pageobjects.Subcategories;

public class Subcategories1 extends Basetest{
	Loginfunctionality Login;
	Subcategories Sub;
	public Subcategories1() {
		super();
	}
@BeforeMethod
public void AddSubcategories() {
	initialization();
	Login=new Loginfunctionality();
	Sub=new Subcategories();
	
}
@Test
public void Setup() throws Throwable {
	Login.verifylogin();
	Sub.Addsubcategories();
	String Url=driver.getCurrentUrl();
	Assert.assertEquals(Url,"http://empirehome.myprojectsonline.co.in/Master/SubCategories?catId=564");
}
@AfterMethod
public void teardown() {

}
}
