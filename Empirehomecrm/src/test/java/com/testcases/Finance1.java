package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Finance;
import com.pageobjects.Loginfunctionality;

public class Finance1 extends Basetest{
	Loginfunctionality login;
	Finance fi;
	public Finance1() {
		super();
	}
	@BeforeMethod
	public void setup() {
		initialization();
		login =new Loginfunctionality();
		fi=new Finance();
		
	}
	@Test
	public void Addfinance() throws Throwable {
		login.verifylogin();
		fi.details();
		
		
	}
	@AfterMethod
	public void teardown() {

	}

}
