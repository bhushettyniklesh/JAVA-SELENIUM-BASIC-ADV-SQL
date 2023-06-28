package Test5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test6.swaglab3;

public class swaglab1 extends swaglab3 {

	@FindBy(id="user-name")
	WebElement b1;
	@FindBy(id="password")
	WebElement b2;
	@FindBy(id="login-button")
	WebElement b3;
	public swaglab1(WebDriver driver) {
		
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void swag1(String usernamevalue,String passwordvalue) {
		
        b1.sendKeys(usernamevalue);
        b2.sendKeys(passwordvalue);
        b3.click();
	}
	
}
