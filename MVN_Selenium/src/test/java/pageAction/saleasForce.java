package pageAction;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import genericlibrary.testbase;
import objectRepository.OR_SalesForce_Login;

public class saleasForce extends testbase {
	
	@Test
	public void salesForceLogin() throws Exception{
		
		LaunchBrowser("chrome");
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		
		OR_SalesForce_Login objrep = PageFactory.initElements(driver,OR_SalesForce_Login.class);
		
		setText(objrep.username,"renur");
		setText(objrep.password,"password");
		Thread.sleep(3000);
		performClick(objrep.login);
		
		
	}

}
