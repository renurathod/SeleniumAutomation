package pageAction;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericlibrary.propertyHelper;
import genericlibrary.testbase;

public class gitHub extends testbase {
	
	@Test
	public void switchFrame() throws Exception{
		propertyHelper ph = new propertyHelper();
		
		LaunchBrowser("chrome");
		driver.get(ph.getValues("Facebook_URL"));
		
		
		driver.switchTo().frame(0);
		
		
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		
		Thread.sleep(3000);;
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("Selenium")).click();
		
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		
		WebElement frame2 = driver.findElement(By.xpath("//frame[@name='classFrame']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.linkText("DefaultSelenium")).click();
		
		
		
		
		
		
		
		
	}

}
