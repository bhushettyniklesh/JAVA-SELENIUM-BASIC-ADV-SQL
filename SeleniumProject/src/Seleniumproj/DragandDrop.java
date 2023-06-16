package Seleniumproj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.gecko.driver","geckodriver.exe");
		
		  WebDriver driver=new FirefoxDriver(); /*
		  driver.get("https://demo.guru99.com/test/drag_drop.html");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 WebElement From1=driver.findElement(By.xpath("//a[text()=' BANK ']"));
		 WebElement To1=driver.findElement(By.xpath("//ol[@id='bank']/li"));
	
		 Actions AC=new Actions(driver);
		  
		 AC.moveToElement(From1).build().perform();
		 Thread.sleep(3000);
		 AC.dragAndDrop(From1,To1).build().perform();*/
		 
		 driver.get("https://demo.guru99.com/test/drag_drop.html");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
			
			WebElement From = driver.findElement(By.xpath("//a[text()=' BANK ']"));
			
			WebElement To = driver.findElement(By.xpath("//ol[@id='bank']/li"));
			
			Actions obj = new Actions(driver);
			
			obj.dragAndDrop(From, To).build().perform();

		 
	}

}
