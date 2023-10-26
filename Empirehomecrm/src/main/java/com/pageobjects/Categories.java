package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class Categories extends Basetest{
	@FindBy(xpath="//span[@class='pe-7s-keypad']")
	WebElement keypad;
	@FindBy(xpath="//span[normalize-space()='Masters']")
	WebElement Masters;
	@FindBy(xpath="//a[normalize-space()='Categories']")
	WebElement Categories;
	@FindBy(xpath="//a[normalize-space()='Add New Category']")
	WebElement Addnew;
	@FindBy(xpath="//input[@id='CategoryName']")
	WebElement Catagoryname;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement Save;
	@FindBy(xpath="//input[@class='form-control form-control-sm']")
	WebElement Sarch;
	//@FindBy(xpath=)
	//WebElement
	//@FindBy(xpath=)
	//WebElement
	public Categories() {
		PageFactory.initElements(driver,this);
	}
	
	public void Addcategories() throws Throwable {
		Thread.sleep(3000);
		keypad.click();
		Thread.sleep(3000);
		Masters.click();
		Thread.sleep(3000);
		Categories.click();
		Thread.sleep(3000);
		Addnew.click();
		Thread.sleep(3000);
		Catagoryname.sendKeys(prop.getProperty("Catagoryname"));
		Thread.sleep(3000);
		Save.click();
		Thread.sleep(3000);
		Sarch.sendKeys(prop.getProperty("Sarch"));
		
		
		
		
	}
	
	
	
	
	

}
