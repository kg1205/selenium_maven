package pom_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pom_Base.BasePage;

public class Login_page extends BasePage {
	@FindBy(name="username") WebElement username;
	@FindBy(name="password") WebElement password;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button") WebElement login;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img") WebElement logo;
	
	public Login_page() {
	
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateLogo() {
		logo.isDisplayed();
		return true;
	}
	public Home_page validateLogin(String uname ,String upass) {
		username.sendKeys(uname);
		password.sendKeys(upass);
		login.click();
		return new Home_page();
	}
}
