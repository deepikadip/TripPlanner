package automationFramework;

import org.testng.annotations.Test;

import pageObjects.Home_Page;
import utility.Constant;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_TC_TripReqExec {
	
	private static WebDriver driver = null;	
  @Test
  public void main() throws InterruptedException {
	  	Home_Page.txt_TripSource(driver).sendKeys(Constant.TripSource);
		
		Home_Page.txt_TripDestination(driver).sendKeys(Constant.TripDestination);
		
		Home_Page.lst_Dest(driver).click();
		
		Home_Page.btn_Go(driver).click();
  }
  @BeforeTest
  public void beforeMethod() {
	  
	  	System.setProperty(Constant.DriverName, Constant.DriverLink);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constant.URL);
  }

  @AfterTest
  public void afterMethod() throws InterruptedException {
	  
	  	Thread.sleep(25000);
	  	//Thread.sleep used here to keep browser open for 25 seconds to have a look at results
	  	//alternatively, can take screenshot here.
		driver.close();
  }

}
