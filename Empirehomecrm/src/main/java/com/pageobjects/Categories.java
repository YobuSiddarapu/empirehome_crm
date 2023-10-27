package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class Categories extends Basetest{
	@FindBy(xpath="//span[@class='pe-7s-keypad']")
	WebElement keypad;
	@FindBy(xpath="//span[normalize-space()='Masters']")
	WebElement Masters;
	@FindBy(xpath="//a[normalize-space()='Categories']")
	WebElement Categories;
	@FindBy(xpath="//a[normalize-space()='Add New Category']")
	WebElement Addnew;
	@FindBy(xpath="//input[@id='CategoryName']")
	WebElement Catagoryname;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement Save;
	@FindBy(xpath="//input[@class='form-control form-control-sm']")
	WebElement Sarch;
	@FindBy(xpath="//i[@class='fa fa-pencil']")
	WebElement Edit;
	@FindBy(xpath="//button[@data-toggle='modal']")
	WebElement Delete;
	@FindBy(xpath="//button[@class='swal-button swal-button--yes']")
	WebElement Deletebtn;
	public Categories() {
		PageFactory.initElements(driver,this);
	}
	
	public void Addcategories() throws Throwable {
		Thread.sleep(3000);
		keypad.click();
		Thread.sleep(3000);
		Masters.click();
		Thread.sleep(3000);
		Categories.click();
		Thread.sleep(3000);
		Addnew.click();
		Thread.sleep(3000);
		Catagoryname.sendKeys(prop.getProperty("Catagoryname"));
		Thread.sleep(3000);
		Save.click();
		Thread.sleep(3000);
		Sarch.sendKeys(prop.getProperty("Sarch"));
		Thread.sleep(3000);
		Edit.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		Delete.click();
		Thread.sleep(3000);
		Deletebtn.click();
		
		
		
		
	}
	
	
	
	
	

}
