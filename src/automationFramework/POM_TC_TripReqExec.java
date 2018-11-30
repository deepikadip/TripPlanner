package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.Home_Page;
import utility.Constant;

public class POM_TC_TripReqExec {

	private static WebDriver driver = null;
	private static WebDriverWait wait = null;
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty(Constant.DriverName, Constant.DriverLink);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constant.URL);
		
		Home_Page.txt_TripSource(driver).sendKeys(Constant.TripSource);
		
		Home_Page.txt_TripDestination(driver).sendKeys(Constant.TripDestination);
		
		try{
		Home_Page.lst_Dest(driver).click();
		}catch(TimeoutException toe){
			wait.until(ExpectedConditions.elementToBeClickable(Home_Page.btn_Go(driver)));
			Home_Page.btn_Go(driver).click();
		}catch(Exception e)
		{
			throw(e);
		}
		
		try{
		Home_Page.btn_Go(driver).click();
		}catch(TimeoutException toe){
			wait.until(ExpectedConditions.elementToBeClickable(Home_Page.btn_Go(driver)));
			Home_Page.btn_Go(driver).click();
		}catch(Exception e)
		{
			throw(e);
		}
		
		
		Thread.sleep(25000);
		driver.close();
	}

}
