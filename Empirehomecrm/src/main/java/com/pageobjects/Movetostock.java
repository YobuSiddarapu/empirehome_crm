package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.Basetest;

public class Movetostock extends Basetest{
	@FindBy(xpath="//span[@class='pe-7s-keypad']")
	WebElement Clickkeypad;
	@FindBy(xpath="//span[normalize-space()='Inventory']")
	WebElement ClickInventary;
	@FindBy(xpath="//a[normalize-space()='Move Stock']")
	WebElement Movetostock;
	@FindBy(xpath="//select[@id='movedFromD']")
	WebElement movedFromD;
	@FindBy(xpath="//input[@id='MoStNot']")
	WebElement notes;
	@FindBy(xpath="//span[@id='select2-invId-container']")
	WebElement Model;
	@FindBy(xpath="//table[@id='daiomndsData']//th[contains(text(),'Model Number')]")
	WebElement Modelnumber;
	@FindBy(xpath="//input[@id='qtymoving']")
	WebElement Quality;
	@FindBy(xpath="//input[@id='btnAdd']")
	WebElement Add;
	
	public Movetostock() {
		PageFactory.initElements(driver,this);
		
		
	}
	public void MovetotheStock() throws Throwable {
		Thread.sleep(3000);
		Clickkeypad.click();
		Thread.sleep(3000);
		ClickInventary.click();
		Thread.sleep(3000);
		Movetostock.click();
		Thread.sleep(3000);
		movedFromD.click();
		Select sc=new Select(movedFromD);
		sc.selectByIndex(1);
		notes.sendKeys(prop.getProperty("notes"));
		Thread.sleep(3000);
		Model.sendKeys(prop.getProperty("Model"));
		Thread.sleep(3000);
		Select se=new Select(Modelnumber);
		Thread.sleep(3000);
		se.selectByIndex(0);
		Quality.sendKeys(prop.getProperty("Quality"));
		Add.click();
		
		
		
		
		
	}
	
	
	
	
	
	

}
