package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class Holiday extends Basetest{
	@FindBy(xpath="//span[@class='pe-7s-keypad']")
	WebElement Keypad;
	@FindBy(xpath="//span[normalize-space()='Masters']")
	WebElement Masters;

	@FindBy(xpath="//a[normalize-space()='Holidays']")
	WebElement Holidays;

	@FindBy(xpath="//a[normalize-space()='Add New']")
	WebElement Addnew;

	@FindBy(xpath="//input[@name='HolidayDate']")
	WebElement Date;

	@FindBy(xpath="//input[@id='HolidayName']")
	WebElement name;
	@FindBy(xpath="//input[@id='HolidayDesc']")
	WebElement Holidaydec;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement Save;
	
	public Holiday() {
		PageFactory.initElements(driver, this);
	}
	public void HolidayFactory() throws Throwable {
		Thread.sleep(3000);
		Keypad.click();
		Thread.sleep(3000);
		Masters.click();
		Thread.sleep(3000);

		Holidays.click();
		Thread.sleep(3000);

		Addnew.click();
		Thread.sleep(3000);

		Date.sendKeys("25122023");
		name.sendKeys("Christmas");
		Thread.sleep(3000);

		Holidaydec.sendKeys("Going to church");
		Thread.sleep(3000);

		Save.click();
		
		
		
		
		
		
		
	}

	
	
	
	
	
	

}
