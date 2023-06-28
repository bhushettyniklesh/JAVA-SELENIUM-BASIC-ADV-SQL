package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;  /////////   Page object model
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestCases.BassClass;


public class LoginPage extends BassClass{
	WebDriver driver;
	//create all object
	
	@FindBy(linkText="Log in")
	WebElement loginLink;
	
	@FindBy(name="user_login")
	WebElement username;
	
	@FindBy(name="user_pwd")
	WebElement password;
	
	@FindBy(className="rememberMe")
	WebElement remember;
	
	@FindBy(name="btn_login")
	WebElement login;
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		///create all method
		
		PageFactory.initElements(driver, this); //driver will execute all global and this will call in this page.
	}
	
	public void Loginfunction(String usernameVal,String passwordVal) {
		
		///WebElement loginLink = driver.findElement(By.linkText("Log in"));
		///String location = loginLink.getAttribute("href");
		///System.out.println("The link will take you to " + location);
		loginLink.click();

		///WebElement username = driver.findElement(By.name("user_login"));
		
		username.sendKeys(usernameVal);
		
		///WebElement password = driver.findElement(By.name("user_pwd"));
		
		password.sendKeys(passwordVal);
		
		///WebElement remember = driver.findElement(By.className("rememberMe"));
		
		remember.click();
		
		///WebElement login = driver.findElement(By.name("btn_login"));
		login.click();
	}
}
