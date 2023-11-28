package com.pageobjects;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class Company extends Basetest{
	@FindBy(xpath="//span[@class='pe-7s-keypad']")
	WebElement keypad;
	@FindBy(xpath="//span[normalize-space()='Masters']")
	WebElement Masters;
	@FindBy(xpath="//a[normalize-space()='Company']")
	WebElement Company;
	@FindBy(xpath="//i[@class='fa fa-pencil']")
	WebElement pencil;
	@FindBy(xpath="//input[@placeholder='Enter Company Name']")
	WebElement CompanyName;
	@FindBy(xpath="//textarea[@placeholder='Enter Company Address']")
	WebElement CompanyAddress;
	@FindBy(xpath="//input[@placeholder='Enter CEO Name']")
	WebElement CEOName;
	@FindBy(xpath="//input[@placeholder='Enter CEO Number']")
	WebElement CEONumber;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement Save;
//	@FindBy(xpath=)
//	WebElement
	public Company() {
		PageFactory.initElements(driver,this);
	}
	public void Adddetails() throws Throwable {
		Thread.sleep(3000);
		keypad.click();
		Thread.sleep(3000);
		Masters.click();
		Thread.sleep(3000);
		Company.click();
		Thread.sleep(3000);
		pencil.click();
		Thread.sleep(3000);
		//Robot r=new Robot();
		CompanyName.clear();
		CompanyName.sendKeys(prop.getProperty("CompanyName"));
		
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_A);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_A);
	//	CompanyName.sendKeys(prop.getProperty("CompanyName"));
		
		
		Thread.sleep(3000);
		CompanyAddress.clear();
		Thread.sleep(3000);
		CompanyAddress.sendKeys(prop.getProperty("CompanyAddress"));
		Thread.sleep(3000);
		CEOName.click();
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_A);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_A);
		CEOName.clear();
		Thread.sleep(3000);
		CEOName.sendKeys(prop.getProperty("CEOName"));
		Thread.sleep(3000);
		CEONumber.click();
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_A);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_A);
		CEONumber.clear();
		Thread.sleep(3000);
		CEONumber.sendKeys(prop.getProperty("CEONumber"));
		Thread.sleep(3000);
		Save.click();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
