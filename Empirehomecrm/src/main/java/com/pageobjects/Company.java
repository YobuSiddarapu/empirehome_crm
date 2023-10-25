package com.pageobjects;

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
		CompanyName.sendKeys("EMPIRE HOME");
		Thread.sleep(3000);
		CompanyAddress.sendKeys("8-2-686/B/2/N, 8-2-686/B/2/N/1F, ROAD NO-12\r\n"
				+ "HYDERABAD, TELANGANA 500 034 INDIA\r\n"
				+ "GSTIN/UIN: 36AJKPM8342C1Z6, State Name :  Telangana, Code : 36");
		Thread.sleep(3000);
		CEOName.sendKeys("KABIR MANGHANANI");
		Thread.sleep(3000);
		CEONumber.sendKeys("89895jj22@");
		Thread.sleep(3000);
		Save.click();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
