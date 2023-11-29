package com.pageobjects;




import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class Staffattendence extends Basetest{
	@FindBy(xpath="//span[@class='pe-7s-keypad']")
	WebElement keypad;
	@FindBy(xpath="//body/div[@class='wrapper']/aside[@class='main-sidebar']/div[@class='sidebar']/span[@id='sideBarMenu']/ul[@class='sidebar-menu']/li[4]/a[1]")
	WebElement staff;
	@FindBy(xpath="//a[normalize-space()='Staff Attendance']")
	WebElement attendence;
	@FindBy(xpath="//input[@placeholder='Employee Code']")
	WebElement empcode;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div[1]/div/form/div/div[2]/div/span/span[1]/span")
	WebElement abc;
	@FindBy(xpath="//input[@role='textbox']")
	WebElement textboooox;
	@FindBy(xpath ="//span[text()='Select Year']")
	WebElement year;
	@FindBy(xpath="//input[@role='textbox']")
	WebElement textboooox1;
	@FindBy(xpath="//button[normalize-space()='Search']")
	WebElement sarch;
//	@FindBy(xpath="//span[@id='select2-Month-20-container']")
//	WebElement month;
//	@FindBy(xpath="")
//	WebElement
//	@FindBy(xpath=)
//	WebElement
//	@FindBy(xpath=)
//	WebElement
	public Staffattendence () {
		PageFactory.initElements(driver,this);
	}
	public void Markattendence() throws Throwable {
		Thread.sleep(3000);
		keypad.click();
		Thread.sleep(3000);
		staff.click();
		Thread.sleep(3000);
		attendence.click();
		Thread.sleep(3000);
		empcode.sendKeys(prop.getProperty("empcode"));
		Thread.sleep(3000);
		//Utils.waits(driver, month);
		//month.click();
		abc.click();
		
		
		
		Thread.sleep(3000);
		textboooox.sendKeys(prop.getProperty("textboooox"));
		Thread.sleep(3000);
		textboooox.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		//Utils.Select(month, 2);
		year.click();
		Thread.sleep(3000);
		textboooox1.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		//Utils.Select(year, 2023);
		Thread.sleep(3000);
		sarch.click();
	}
	

}
