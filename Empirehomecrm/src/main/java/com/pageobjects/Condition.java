package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class Condition extends Basetest {
	@FindBy(xpath="//span[@class='pe-7s-keypad']")
	WebElement keypad;
	@FindBy(xpath="//span[normalize-space()='Masters']")
	WebElement Masters;
	@FindBy(xpath="//a[normalize-space()='Condition']")
	WebElement Condition;
	@FindBy(xpath="//a[normalize-space()='Add New']")
	WebElement Add;
	@FindBy(xpath="//input[@id='ConditionName']")
	WebElement ConditionName;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement Save;
	@FindBy(xpath="//input[@class='form-control form-control-sm']")
	WebElement sarch;
	//@FindBy(xpath=)
//	WebElement
//	@FindBy(xpath=)
//	WebElement
//	@FindBy(xpath=)
//	WebElement
	public Condition() {
		PageFactory.initElements(driver, this);
	}
	public void AddCondition() throws Throwable  {
		Thread.sleep(3000);
		keypad.click();
		Thread.sleep(3000);
		Masters.click();
		Thread.sleep(3000);
		Condition.click();
		Thread.sleep(3000);
		Add.click();
		Thread.sleep(3000);
		ConditionName.sendKeys(prop.getProperty("ConditionName"));
		Thread.sleep(3000);
		Save.click();
		Thread.sleep(3000);
		sarch.sendKeys(prop.getProperty("sarch"));
		
		
		
		
	}

}
