package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class NewEmploye extends Basetest{
	@FindBy(xpath="//span[@class='pe-7s-keypad']")
	WebElement keypad;
	@FindBy(xpath="//span[normalize-space()='Staff']")
	WebElement Staff;
	@FindBy(xpath="//a[normalize-space()='Add New Staff']")
	WebElement Addstaff;
	@FindBy(xpath="//input[@placeholder='Name']")
	WebElement Name;
	@FindBy(xpath="//input[@placeholder='Enter Your Mail']")
	WebElement Mail;
	@FindBy(xpath="//input[@placeholder='Mobile Number']")
	WebElement Mobile;
	@FindBy(xpath="//span[@id='select2-UserTypeId-container']")
	WebElement Disgni;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement Save;
	public NewEmploye() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void Addemploye1() throws Throwable {
		Thread.sleep(3000);
		keypad.click();
		Thread.sleep(3000);
		Staff.click();
		Thread.sleep(3000);
		Addstaff.click();
		Name.sendKeys(prop.getProperty("Name"));
		Thread.sleep(3000);
		Mail.sendKeys(prop.getProperty("Mail"));
		Thread.sleep(3000);
		Mobile.sendKeys(prop.getProperty("Mobile"));
		Disgni.sendKeys(prop.getProperty("Disgni"));
		Thread.sleep(3000);
		Save.click();
		
		
		
		
		
		
		
	}

}
