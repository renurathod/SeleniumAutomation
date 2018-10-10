package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OR_FB_Login {
	
@FindBy (xpath="//input[@name='firstname']")
public WebElement firstName;

@FindBy (xpath="//input[@name='lastname']")
public WebElement lastName;

@FindBy(xpath="//input[@name='reg_email__']")
public WebElement email;

@FindBy (xpath="//input[@name='reg_passwd__']")
public WebElement password;

@FindBy (xpath="//label[contains(text(),'Female')]")
public WebElement gender;

@FindBy (xpath="//select[@id='day']")
public WebElement day;

@FindBy (xpath="//select[@id='month']")
public WebElement month;

@FindBy (xpath="//select[@name='birthday_year']")
public WebElement year;

@FindBy (xpath="//button[@name='websubmit']")
public WebElement signUp;

@FindBy (xpath="//span[contains(text(),'Create an account')]")
public WebElement createAcctText;



}
