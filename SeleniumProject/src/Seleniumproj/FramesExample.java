package Seleniumproj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.gecko.driver","geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.get("https://demoqa.com/frames");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.switchTo().frame("frame1");
		  WebElement Frame=driver.findElement(By.id("sampleHeading"));
		  System.out.println(Frame.getText());
		  
		  driver.switchTo().defaultContent();
		  
		  driver.switchTo().frame("frame2");
		  
		  WebElement Frame3=driver.findElement(By.id("sampleHeading"));
		  System.out.println(Frame3.getText());
		  driver.switchTo().defaultContent();
		  
		  WebElement Frame4=driver.findElement(By.className("main-header"));
		  System.out.println(Frame4.getText());
		  driver.close();
		  driver.quit();
	}

}
