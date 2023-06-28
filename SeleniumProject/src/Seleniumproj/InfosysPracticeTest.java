package Seleniumproj;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InfosysPracticeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.gecko.driver","geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.get("https://www.makeinjava.com");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  List<WebElement> numberOfLinks = driver.findElements(By.tagName("a"));
	        // count no of links on page
	        System.out.println("Number of links on Web Page :" +numberOfLinks.size());
	}

}
