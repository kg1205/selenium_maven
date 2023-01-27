package testNg;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Capturescreenshot {
	public WebDriver driver;
  
	  @Test
	  public void ddtimeshot1() throws Exception{
		  Date dt=new Date();
		  DateFormat dtformat=new SimpleDateFormat("dd-mm-yyyy-hh-mm-ss-");
		  File src1=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(src1, new File("C:\\Users\\DELL\\Desktop" +dtformat.format(dt)+"ganesh.png"));
		  	  
	  }
 
@BeforeTest
  public void beforeTest() {
	 
		  System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://seleniumbymahesh.com");
		  driver.manage().window().maximize();
	 

  }

}
