package pom_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pom_Base.BasePage;

public class Home_page extends BasePage {
	@FindBy(xpath = "//a[@class='oxd-main-menu-item active']")
	WebElement admin;
	
	public Home_page(){
		PageFactory.initElements(driver, this);
	}
	
	public void clickonadmintab(){
		admin.click();
		
	}
	

}
