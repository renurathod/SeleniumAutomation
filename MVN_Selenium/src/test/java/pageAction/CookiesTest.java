package pageAction;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import genericlibrary.propertyHelper;
import genericlibrary.testbase;

public class CookiesTest extends testbase{
	
	@Test
	public void getCookies() throws Exception{
		
		propertyHelper ph = new propertyHelper();
		
		LaunchBrowser("chrome");
		driver.get(ph.getValues("Facebook_URL"));
		
		Set<Cookie> allCookies = driver.manage().getCookies();
		System.out.println("**********Size of Cookies before : " + allCookies.size()+ " **********");
		
		for(Cookie eachCookie: allCookies){
			System.out.println();
			System.out.println("Cookies Name" + eachCookie.getName());
			System.out.println("Cookie Value" + eachCookie.getValue());
			System.out.println("Cookie Domain" + eachCookie.getDomain());
			System.out.println("Cookie Path" + eachCookie.getPath());
			
		}
		
		driver.manage().deleteAllCookies();
		Set<Cookie> deletedCookies = driver.manage().getCookies();
		System.out.println();
		System.out.println("**********Size of cookies after : " + deletedCookies.size()+ "**********");
		
		
	}
	

}

