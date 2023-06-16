package Seleniumproj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class movingmouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.gecko.driver","geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.get("https://www.w3schools.com/html/html_tables.asp");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 WebElement scrollTo=driver.findElement(By.xpath("//h2[text()='HTML Exercises']"));
		  
			JavascriptExecutor obj=(JavascriptExecutor) driver;
			obj.executeScript("arguments[0].scrollIntoView();", scrollTo);
			Thread.sleep(3000);
			//scroll up
			obj.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
	}

}
