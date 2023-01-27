package pom_testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom_Base.BasePage;
import pom_pages.Home_page;
import pom_pages.Login_page;

public class HomePage_test extends BasePage{
	public Login_page login_Page;
	public Home_page homepage;
	
	@Test(priority = 3)
	public void adminTabTest() throws Exception {
		System.out.println("33333333333");
		homepage= login_Page.validateLogin("Admin", "admin123");
		homepage.clickonadmintab();
		Thread.sleep(2000);
		String expectedurl="https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
		String actualurl=driver.getCurrentUrl();
		Assert.assertEquals(actualurl, expectedurl);
		
	}
}
