package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbook {
	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")WebElement link;
	@FindBy(xpath = "//a[text()='Login']")WebElement login;
	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")WebElement mobile;
	@FindBy(xpath = "//input[@class='_2IX_2- _3mctLh VJZDxU']")WebElement pass;
	@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")WebElement submit;
	public fbook(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void flipcartlogin() throws Exception {
		link.click();
		Thread.sleep(2000);
		login.submit();
		mobile.sendKeys("ganeshkodimoju52@gmail.com");
		pass.sendKeys("Ganesh@23");
		submit.click();
	}
}
