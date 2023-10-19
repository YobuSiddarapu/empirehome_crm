package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginfunctionality;
import com.pageobjects.Movetostock;

import net.bytebuddy.implementation.bind.annotation.Super;

public class Movestock extends Basetest{
	Loginfunctionality Login;
	Movetostock Ms;
	
	public Movestock() {
		super();
	}
	
	@BeforeMethod
	public void movetostiock() {
		initialization();
		Login = new Loginfunctionality();
		Ms=new Movetostock();
	
		
	}
	@Test
	public void Movestock() throws Throwable  {
		Login.verifylogin();
		Ms.MovetotheStock();
		
		String Url=driver.getCurrentUrl();
		Assert.assertEquals(Url,"http://empirehome.myprojectsonline.co.in/Inventory/MoveStock");
		
		
	}
	@AfterMethod
	public void teardown() {

	}
	
	
	
	
	

}
