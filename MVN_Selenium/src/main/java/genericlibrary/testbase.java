package genericlibrary;

import java.io.File;
//import java.util.logging.FileHandler;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.OutputType;

public class testbase {
	public static WebDriver driver;
	propertyHelper ph = new propertyHelper();
	public WebDriver LaunchBrowser(String browser) throws Exception{
		
	//************************************Launch Browser************************************
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver",ph.getValues("Chrome_Driver"));
			driver = new ChromeDriver();		
		
		}else if(browser.equalsIgnoreCase("firefox")){
			
			System.setProperty("webdriver.gecko.driver",ph.getValues("Firefox_Driver"));
			driver = new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	//************************************SET TEXT************************************
	public void setText(WebElement obj, String value){
		
		obj.sendKeys(value);
		
	}
	
	//************************************CLICK************************************
	public void performClick(WebElement obj){
		obj.click();
	}
	
	//************************************Take Screenshot************************************
	public void takeSnapShot(String fileName) throws Exception{

	    //Convert web driver object to TakeScreenshot

	    TakesScreenshot scrShot =((TakesScreenshot)driver);

	    //Call getScreenshotAs method to create image file

	            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	        //Move image file to new destination

	            File DestFile=new File(ph.getValues("Screenshot_Destination") + fileName+".png");

	            //Copy file at destination

	            //FileUtils.copyFile(SrcFile, DestFile);
	            FileHandler.copy(SrcFile, DestFile);
	  
	}
	
	//************************************Wait Method************************************
	public void waitUntil(WebElement obj){
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(obj));
	
	}
	
	//************************************Dropdown************************************
	public void selectFromDropdown(WebElement obj, String value, String type){
		Select s = new Select(obj);
		if(type.equalsIgnoreCase("bytext")){
			s.selectByVisibleText(value);
		}else if(type.equalsIgnoreCase("byvalue")){
			s.selectByValue(value);
		}else if(type.equalsIgnoreCase("byindex")){
			s.selectByIndex(Integer.parseInt(value));
		}
		
	}

}
