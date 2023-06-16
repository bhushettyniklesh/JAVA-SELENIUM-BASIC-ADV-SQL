package Seleniumproj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.gecko.driver","geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.get("https://demoqa.com/alerts");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  WebElement alert1=driver.findElement(By.id("alertButton"));
		  alert1.click();
		  Alert obj2=driver.switchTo().alert();
		  Thread.sleep(3000);
		  obj2.accept();
		  
		  WebElement f1=driver.findElement(By.id("confirmButton"));
		  JavascriptExecutor f2=(JavascriptExecutor) driver;
			f2.executeScript("arguments[0].scrollIntoView();", f1);
			Thread.sleep(3000);
		 f1.click();
		  Alert obj=driver.switchTo().alert();
		  Thread.sleep(3000);
		  obj.dismiss();
		  driver.close();
	}

}
