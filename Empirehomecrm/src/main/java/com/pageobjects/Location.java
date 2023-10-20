package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class Location extends Basetest{
	@FindBy(xpath="//span[@class='pe-7s-keypad']")
	WebElement keypad;
	@FindBy(xpath="//span[normalize-space()='Masters']")
	WebElement Masters;
	@FindBy(xpath="//a[normalize-space()='Location']")
	WebElement Location;
	@FindBy(xpath="//a[normalize-space()='Add New']")
	WebElement Add;
	@FindBy(xpath="//input[@id='LocationName']")
	WebElement LocationName;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement Save;
	@FindBy(xpath="//input[@class='form-control form-control-sm']")
	WebElement sarch;
	public Location() {
		PageFactory.initElements(driver,this);
	}
	public void AddLocation1() throws Throwable {
		Thread.sleep(3000);
		keypad.click();
		Thread.sleep(3000);
		Masters.click();
		Thread.sleep(3000);
		Location.click();
		Thread.sleep(3000);
		Add.click();
		Thread.sleep(3000);
		LocationName.sendKeys("Padur");
		Thread.sleep(3000);
		Save.click();
		Thread.sleep(3000);
		sarch.sendKeys("Padur");
		
		
		
		
	}

}
