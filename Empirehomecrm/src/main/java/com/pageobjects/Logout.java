package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class Logout extends Basetest{
	@FindBy(xpath="//img[@alt='user']")
	WebElement User;
	@FindBy(xpath="//a[normalize-space()='Signout']")
	WebElement Signout;
	public Logout() {
		PageFactory.initElements(driver, this);
	}
	public void Exit() throws Throwable {
		Thread.sleep(3000);
		User.click();
		Thread.sleep(3000);
		Signout.click();
		
	}
	

}
