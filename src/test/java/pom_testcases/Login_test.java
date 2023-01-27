package pom_testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom_Base.BasePage;
import pom_pages.Home_page;
import pom_pages.Login_page;

public class Login_test extends BasePage {
	public Login_page login_Page;
	public Home_page home_page;
	@Test(priority = 1)
	public void verify_Logo(){
		System.out.println("11111111111111111111111111111111");
		boolean flag=login_Page.validateLogo();
		Assert.assertTrue(flag);
		
	}
	@Test(priority = 2)
	public void logintest() {
		System.out.println("2222222222");
		home_page=login_Page.validateLogin("Admin", "admin123");
		String expectedurl="https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
		String actualurl=driver.getCurrentUrl();
		Assert.assertEquals(actualurl, expectedurl);
	}
}
