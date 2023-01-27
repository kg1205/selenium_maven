package pom_Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pom_pages.Login_page;

public class BasePage {
	public WebDriver driver;
	Login_page login_page;
	@BeforeMethod
	public void setup() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("10");
		driver.manage().window().maximize();
		login_page=new Login_page();
		Thread.sleep(10000);
	}
	//@After
	public void tearDown() {
		driver.close();
	}
}
