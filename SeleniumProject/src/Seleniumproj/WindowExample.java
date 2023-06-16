package Seleniumproj;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.getProperty("webdriver.gecko.driver","geckodriver.exe");
		
		  WebDriver driver=new FirefoxDriver();
		  driver.get("https://demoqa.com/browser-windows");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  WebElement wind=driver.findElement(By.id("tabButton"));
		  String parentwin = driver.getWindowHandle();
		  System.out.println("parent window  " + parentwin);
		  wind.click();
		  
		  Set<String> multiplewin=driver.getWindowHandles();
		  String childwin="";
		  System.out.println("windowhandles  "+ multiplewin);
		  
		  for(String win: multiplewin) {
			  
			  System.out.println(win);
			  if(!win.equals(parentwin)) {
				  childwin=win;
			  }
		  }
		  System.out.println(childwin);
		  
		  driver.switchTo().window(childwin);
		  WebElement w1=driver.findElement(By.id("sampleHeading"));
		  System.out.println(w1.getText());
		  driver.close();
		  
		  //new window 2nd tab assignment
		  
		  driver.switchTo().window(parentwin);
		  WebElement newwind=driver.findElement(By.id("windowButton"));
		  newwind.click();
		  
		  multiplewin=driver.getWindowHandles();
		  
		  
		  for(String win:multiplewin) {
			  System.out.println(win);
			  if(!win.equals(parentwin)) {
				  childwin=win;
			  }
		  }
		  System.out.println(childwin);
		  driver.switchTo().window(childwin);
		  
		  WebElement w2=driver.findElement(By.id("sampleHeading"));
		  System.out.println(w2.getText());
		  driver.close();
		  
		//new window 3rd tab assignment
		driver.switchTo().window(parentwin);
		  WebElement messageWindowButton=driver.findElement(By.id("messageWindowButton"));
		  messageWindowButton.click();
		  multiplewin=driver.getWindowHandles();
		  for(String win:multiplewin){
			  System.out.println(win);
			  if(!win.equals(parentwin)) {
				  childwin=win;
			  }
		  }
		  System.out.println(childwin);
		  WebElement w3=driver.findElement(By.xpath("/html/body"));
		  System.out.println(w3.getText());
		  driver.quit();
	}

}
