package Seleniumproj;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class lunchbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.getProperty("webdriver.gecko.driver","geckodriver.exe");
  WebDriver driver=new FirefoxDriver();
  driver.get("https://www.simplilearn.com/");
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  
  System.out.println(driver.getTitle());
  
  WebElement loginLink = driver.findElement(By.linkText("Log in"));
	String location = loginLink.getAttribute("href");
	System.out.println("The link will take you to " + location);
	loginLink.click();

	WebElement username = driver.findElement(By.name("user_login"));
	username.sendKeys("nageswararao.pragada@gmail.com");
	WebElement password = driver.findElement(By.name("user_pwd"));
	password.sendKeys("Nagamani1236");
	
	WebElement remember = driver.findElement(By.className("rememberMe"));
	remember.click();
	
	WebElement login = driver.findElement(By.name("btn_login"));
	login.click();
	
	WebElement validate = driver.findElement(By.className("error_msg"));
	String validate1 = validate.getText();
	System.out.println(validate1);
	if(validate.isDisplayed()) {
		System.out.println("tc passed");
	}else {
		System.out.println("tc failed");
	}
	
	List<WebElement> Strings=driver.findElements(By.tagName("a"));
	System.out.println(Strings.size());
	
	for(WebElement link:Strings) {
		System.out.println(link.getAttribute("href"));
	}
	
	driver.close();

	}
}
