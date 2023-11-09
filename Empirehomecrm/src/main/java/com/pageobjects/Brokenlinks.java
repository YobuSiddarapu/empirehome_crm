package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.Basetest;

public class Brokenlinks extends Basetest{
	@FindBy(xpath="//a[normalize-space()='Selenium Practice']")
	WebElement Selenium;
	public Brokenlinks() {
		 PageFactory.initElements(driver,this);
	}
	public void verify() throws Throwable {
		Actions ac=new Actions(driver);
		Thread.sleep(3000);
		ac.moveToElement(Selenium);
		Thread.sleep(3000);
		Select sc=new Select(Selenium);
		Thread.sleep(3000);
		sc.selectByIndex(0);
		
	}

}
