package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.Basetest;

public class Subcategories extends Basetest {
	@FindBy(xpath="//span[@class='pe-7s-keypad']")
	WebElement keypad;
	@FindBy(xpath="//span[normalize-space()='Masters']")
	WebElement Masters;
	@FindBy(xpath="//a[normalize-space()='Sub Categories']")
	WebElement Sub;
	@FindBy(xpath="//a[normalize-space()='Add New Sub Category']")
	WebElement Add;
	@FindBy(xpath="//select[@id='subcatDD']")
	WebElement subcat;
	@FindBy(xpath="//input[@id='SubCategoryName']")
	WebElement name1;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement save;
	@FindBy(xpath="//input[@class='form-control form-control-sm']")
	WebElement sarch;
	public Subcategories() {
		PageFactory.initElements(driver, this);
	}
	public void Addsubcategories() throws Throwable {
		Thread.sleep(3000);
		keypad.click();
		Thread.sleep(3000);
		Masters.click();
		Thread.sleep(3000);
		Sub.click();
		Thread.sleep(3000);
		Add.click();
		Thread.sleep(3000);
		subcat.click();
		Thread.sleep(3000);
		Select sc=new Select(subcat);
		Thread.sleep(3000);
		sc.selectByIndex(2);
		Thread.sleep(3000);
		name1.sendKeys(prop.getProperty("name1"));
		Thread.sleep(3000);
		save.click();
		Thread.sleep(3000);
		sarch.sendKeys(prop.getProperty("sarch"));
		
		
		
		
		
	}


}
