package testNg;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Youtube {
	public WebDriver driver;
  @Test
  public void f() throws Exception {
	 Thread.sleep(1000);
	  driver.findElement(By.name("search_query")).sendKeys("bahubali2telugu trailer");
	  driver.findElement(By.id("search-icon-legacy")).click();
	
	  driver.findElement(By.id("mouseover-overlay")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.youtube.com/");
	  driver.manage().window().maximize();
  }

}
