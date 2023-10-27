package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class Usertype extends Basetest {
	@FindBy(xpath="//span[@class='pe-7s-keypad']")
	WebElement keypad;
	@FindBy(xpath="//span[normalize-space()='Masters']")
	WebElement wrapper;
	@FindBy(xpath="//a[normalize-space()='User Types']")
	WebElement User;
	@FindBy(xpath="//a[normalize-space()='Add New']")
	WebElement Add;
	@FindBy(xpath="//input[@id='TypeName']")
	WebElement TypeName;
	@FindBy(xpath="//input[@id='TypeCode']")
	WebElement TypeCode;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement Save;
	@FindBy(xpath="//input[@class='form-control form-control-sm']")
	WebElement Sarch;
	public Usertype() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void UserFanctionality() throws Throwable {
		Thread.sleep(3000);
		keypad.click();
		Thread.sleep(3000);
		wrapper.click();
		Thread.sleep(3000);
		User.click();
		Thread.sleep(3000);
		Add.click();
		Thread.sleep(3000);
		TypeName.sendKeys(prop.getProperty("TypeName"));
		Thread.sleep(3000);
		TypeCode.sendKeys(prop.getProperty("TypeCode"));
		Thread.sleep(3000);
		Save.click();
		Thread.sleep(3000);
		Sarch.sendKeys(prop.getProperty("TypeName"));
		
		
		
	}

}
