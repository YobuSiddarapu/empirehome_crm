package com.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;
import com.utils.Utils;

public class Finance extends Basetest {
	@FindBy(xpath="//span[@class='pe-7s-keypad']")
	WebElement keypad;
	@FindBy(xpath="//span[normalize-space()='Finance']")
	WebElement finance;
	@FindBy(xpath="//a[normalize-space()='Payments']")
	WebElement payments;
	@FindBy(xpath="//a[@class='btn btn-add']")
	WebElement add;
	@FindBy(xpath="//span[@id='select2-subcatDD-container']")
	WebElement cont;
	@FindBy(xpath="//input[@id='HeadName']")
	WebElement head;
	@FindBy(xpath="//input[@id='StartingBallance']")
	WebElement bal;
	@FindBy(xpath="//input[@role='textbox']")
	WebElement textBank;
	@FindBy(xpath="//div[@class='content']")
	WebElement content;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement save;
	
	
	public  Finance() {
		PageFactory.initElements(driver, this);
	}
	public void details() throws Throwable {
		Thread.sleep(3000);
		keypad.click();
		Thread.sleep(3000);
		finance.click();
		Thread.sleep(3000);
		payments.click();
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		cont.click();
		Thread.sleep(3000);
		textBank.click();
		Thread.sleep(3000);
		textBank.sendKeys(prop.getProperty("textBank"));
		Thread.sleep(3000);
		textBank.sendKeys(Keys.ENTER);
		content.click();
		//Utils.Select(cont, 1);
		Thread.sleep(3000);
		head.sendKeys(prop.getProperty("head"));
		Thread.sleep(3000);
		bal.sendKeys(prop.getProperty("bal"));
		Thread.sleep(3000);
		save.click();
	}
}




















