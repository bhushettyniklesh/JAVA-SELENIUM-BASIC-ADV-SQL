package new1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class new2 {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver;
driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.youtube.com/");
driver.manage().window().maximize();
String title=driver.getTitle();
System.out.println("titile of the page:"+title);
WebElement w1 = driver.findElement(By.xpath("input[]"));
Select s1=new Select(w1);
s1.selectByValue("dosa");
WebElement veg=driver.findElement(By.xpath("fr"));
WebElement nonveg=driver.findElement(By.xpath("bt"));
System.out.println(veg.isEnabled());
veg.click();
System.out.println(nonveg.isSelected());
if(nonveg.isSelected()==false) {
	nonveg.click();
}
WebElement checkbox = driver.findElement(By.xpath("fr"));
System.out.println(checkbox.isDisplayed());
System.out.println(checkbox.isEnabled());
checkbox.click();
if(checkbox.isSelected()==false) {
	checkbox.click();
}
driver.close();
	}
}
