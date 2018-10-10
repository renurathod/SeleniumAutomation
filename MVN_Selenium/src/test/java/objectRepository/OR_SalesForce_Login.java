package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OR_SalesForce_Login {
	
	@FindBy (id="username")
	public WebElement username;
	
	@FindBy (name="pw")
	public WebElement password;
	
	@FindBy (xpath="//input[@id='Login']")
	public WebElement login;
	
	//@FindBy ()

}
