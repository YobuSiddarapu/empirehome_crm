package com.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.base.Basetest;
import com.pageobjects.Addproduct;
import com.pageobjects.Loginfunctionality;
import com.utils.*;
import com.utils.Utils.utils;

public class addproduct_test extends Basetest {

	Loginfunctionality Login;
	Addproduct Add;
	private final String sheetname1 = "Sheet1";
	public addproduct_test() {
		super();
	}

	@DataProvider

	public String[][] dataload() throws Throwable {
		return utils.Data(sheetname1);
		
	}

	@BeforeMethod
	public void setup() {

		initialization();

		Login = new Loginfunctionality();
				
		Add = new Addproduct();
	}

	@Test(dataProvider = "dataload", dataProviderClass = addproduct_test.class)

	public void Addproductvalidation(String ModelNumber, String Title, String ItemDescription, String Height,
			String Width, String Breadth, String ColorName, String ActualPrice, String textMRP, String Qty)
			throws Throwable {
		Login.verifylogin();
		Add.verifyAddInventorypage(ModelNumber, Title, ItemDescription, Height, Width, Breadth, ColorName, ActualPrice, textMRP, Qty);

		String urltest = driver.getCurrentUrl();
		AssertJUnit.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Inventory/All");

	}

	@AfterMethod
	public void teardown() {

	}

}
