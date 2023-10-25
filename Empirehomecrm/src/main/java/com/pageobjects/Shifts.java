package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class Shifts extends Basetest {
	@FindBy(xpath="//span[@class='pe-7s-keypad']")
	WebElement keypad;
	@FindBy(xpath="//span[normalize-space()='Masters']")
	WebElement Masters;
	@FindBy(xpath="//a[normalize-space()='Shifts']")
	WebElement Shifts;
	@FindBy(xpath="//a[normalize-space()='Add New']")
	WebElement Add;
	@FindBy(xpath="//input[@id='ShiftName']")
	WebElement ShiftName;
	@FindBy(xpath="//input[@name='StartTime']")
	WebElement StartTime;
	@FindBy(xpath="//input[@name='EndTime']")
	WebElement EndTime;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement Save;
	@FindBy(xpath="//input[@class='form-control form-control-sm']")
	WebElement sarch;
	
	public Shifts() {
		PageFactory.initElements(driver, this);
	}
	public void Addshifts() throws Throwable {
		Thread.sleep(3000);
		keypad.click();
		Thread.sleep(3000);
		Masters.click();
		Thread.sleep(3000);
		Shifts.click();
		Thread.sleep(3000);
		Add.click();
		Thread.sleep(3000);
		ShiftName.sendKeys("General");
		Thread.sleep(3000);
		StartTime.click();
		Thread.sleep(3000);
		StartTime.sendKeys("0910");
		Thread.sleep(3000);
		EndTime.click();
		Thread.sleep(3000);
		EndTime.sendKeys("0610");
		Thread.sleep(3000);
		Save.click();
		Thread.sleep(3000);
		sarch.sendKeys("General");
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
