package testNg;

import org.testng.annotations.Test;

import com.selenium.fb;
import com.selenium.fbook;

import org.testng.annotations.BeforeClass;

public class facebook extends fb {
  @Test
  public void f() throws Exception{
	  fbook f=new fbook(driver);
	  f.flipcartlogin();
  }
  @BeforeClass
  public void beforeClass() {
	  browserlaunch("chrome","http://flipkart.com");
  }
}

