package pageAction;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import genericlibrary.Xls_Reader;
import genericlibrary.propertyHelper;
import genericlibrary.testbase;
import objectRepository.OR_FB_Login;

public class FacebookLogin extends testbase{	
	
	@Test
	public void launch() throws Exception{	
	// TODO Auto-generated method stub
		
		propertyHelper ph = new propertyHelper();
		Xls_Reader xl = new Xls_Reader("C:\\Users\\RAJAT\\workspace\\Data_Excel\\Facebook_Data.xlsx");
		LaunchBrowser("chrome");
		driver.get(ph.getValues("Facebook_URL"));
		
		//Create Object for ObjectRepository File
		OR_FB_Login objrep = PageFactory.initElements(driver, OR_FB_Login.class);
		
		waitUntil(objrep.signUp);
		
		setText(objrep.firstName, xl.getCellData("Sheet1", "NU_FirstName", 1));
		setText(objrep.lastName, xl.getCellData("Sheet1", "NU_LastName", 1));
		setText(objrep.email, xl.getCellData("Sheet1", "NU_EmailPhone", 1));
		setText(objrep.password, xl.getCellData("Sheet1","NU_Password", 1));
				
		takeSnapShot("Create new user");
		
		selectFromDropdown(objrep.day,xl.getCellData("Sheet1", "DOB_Day", 1),"byvalue");
		selectFromDropdown(objrep.month, xl.getCellData("Sheet1", "DOB_Month", 1), "byvalue");
		selectFromDropdown(objrep.year,xl.getCellData("Sheet1", "DOB_Year", 1),"byvalue");
		
		performClick(objrep.gender);

		String varText=objrep.createAcctText.getText();
		xl.setCellData("Sheet1", "text", 1, varText);
		xl.setCellData("Sheet1", "Result", 1, "Pass");
		/*
		List <WebElement> objLinks = driver.findElements(By.tagName("a"));
		for (WebElement currentLink : objLinks){
			System.out.println(currentLink.getText());
		}*/
		
		/* OR
		 * 
		 * List <WebElement> objLinks = driver.findElements(By.tagName("a"));
		for (WebElement currentLink : objLinks){
			String linkText = currentLink.getText();
			 if(linkTExt.equals("forgotten password")){
			 
			 then 
			 
			}
			System.out.println(linkText);
		}*/
		
	}

}
