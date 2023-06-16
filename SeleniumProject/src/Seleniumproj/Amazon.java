package Seleniumproj;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;



public class Amazon{

public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub

	System.getProperty("webdriver.gecko.driver","geckodriver.exe");
	
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  WebElement a1=driver.findElement(By.id("twotabsearchtextbox"));
	  a1.sendKeys("smasung mobiles");
	  WebElement a2=driver.findElement(By.id("nav-search-submit-button"));
	  a2.click();
	  
	  WebElement a3=driver.findElement(By.xpath("//span[text()='Samsung Galaxy M13 (Midnight Blue, 4GB, 64GB Storage) | 6000mAh Battery | Upto 8GB RAM with RAM Plus']"));
	  System.out.println(a3.getText());
	  
	  WebElement a4=driver.findElement(By.xpath("//span[text()='9,699']"));
	  System.out.println(a4.getText());
	  
	  WebElement scrollTo=driver.findElement(By.xpath("//span[text()='Need help?']"));
	  
		JavascriptExecutor obj=(JavascriptExecutor) driver;
		obj.executeScript("arguments[0].scrollIntoView();", scrollTo);
		Thread.sleep(3000);
		//scroll up
		obj.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		
		EventFiringWebDriver efw= new EventFiringWebDriver(driver);
		File f1=efw.getScreenshotAs(OutputType.FILE);
		File f2 = new File("C:\\selenium\\seleniumScreenshot/imagine3.jpg");
		try {
			FileUtils.moveFile(f1, f2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(f2.canExecute()) {
			System.out.println("taken SS");
		}else {
			System.out.println("no ss");
		}
	  driver.close();

}}
