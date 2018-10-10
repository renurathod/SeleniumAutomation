package pageAction;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericlibrary.testbase;

public class jetAirways extends testbase {

	@Test
	public void launch(){
		//LaunchBrowser("chrome");
		
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com");
		
		driver.findElement(By.xpath(""));
		
	}
}
