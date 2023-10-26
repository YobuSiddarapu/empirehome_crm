package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class AddCustomer extends Basetest {
	@FindBy(xpath="//span[@class='pe-7s-keypad']")
	WebElement Clickkeypad;
	@FindBy(xpath="//span[normalize-space()='Customers']")
	WebElement Customers;
	@FindBy(xpath="//a[normalize-space()='Add Customer']")
	WebElement AddCustomer;
	@FindBy(xpath="//input[@placeholder='Enter Customer Name']")
	WebElement CustomerName;
	@FindBy(xpath="//input[@placeholder='Enter Mobile Number']")
	WebElement Mobile;
	@FindBy(xpath="//input[@placeholder='Enter Email Id']")
	WebElement Email;
	@FindBy(xpath="//input[@placeholder='Enter Whatsapp Number']")
	WebElement whatsapp;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement save;
	public AddCustomer() {
		PageFactory.initElements(driver, this);
	}
	
	public void AddnewCus() throws Throwable {
		Thread.sleep(3000);
		Clickkeypad.click();
		Thread.sleep(3000);
		Customers.click();
		AddCustomer.click();
		Thread.sleep(3000);
		CustomerName.sendKeys(prop.getProperty("CustomerName"));
		Mobile.sendKeys(prop.getProperty("Mobile"));
		Thread.sleep(3000);
		Email.sendKeys(prop.getProperty("Email"));
		whatsapp.sendKeys(prop.getProperty("whatsapp"));
		save.click();
		
		
		
		
		
		
	}

}
