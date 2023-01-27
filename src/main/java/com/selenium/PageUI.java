package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageUI {
	@FindBy(linkText = "HMS")WebElement linkHMS;
	@FindBy(name = "username")WebElement txtUsername;
	@FindBy(name = "password")WebElement txtpassword;
	@FindBy(name = "submit")WebElement btnLogin;
	@FindBy(linkText = "Logout")WebElement linkLogout;
	public PageUI(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void hmslogin() {
		linkHMS.click();
		txtUsername.sendKeys("admin");
		txtpassword.sendKeys("admin");
		btnLogin.click();
	}
	public void hmsLogout() {
		linkLogout.click();
	}

}
