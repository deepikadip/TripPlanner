package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Constant;

public class Home_Page {
	
private static WebElement element = null;
	
	public static WebElement txt_TripSource(WebDriver driver)
	{
		element = driver.findElement(By.id(Constant.IdSource));
		return element;
	}
	
	public static WebElement txt_TripDestination(WebDriver driver)
	{
		element = driver.findElement(By.id(Constant.IdDestination));
		return element;
	}
	
	public static WebElement btn_Go(WebDriver driver)
	{	
		element = driver.findElement(By.id(Constant.IdGo));
		return element;
	}
	
	public static WebElement lst_Dest(WebDriver driver)
	{
		element = driver.findElement(By.id(Constant.IdListDest));
		return element;
	}
}
