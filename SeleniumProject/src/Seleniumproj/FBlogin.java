package Seleniumproj;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FBlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.gecko.driver","geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.get("https://www.facebook.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  WebElement creataccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		  creataccount.click();
		  
		  WebElement username = driver.findElement(By.xpath("//input[@name='firstname']"));
			username.sendKeys("nageswararao");
			WebElement password = driver.findElement(By.xpath("//input[@name='lastname']"));
			password.sendKeys("Naga");
			WebElement s2 = driver.findElement(By.xpath("//input[@name='reg_email__']"));
			s2.sendKeys("Naga@gmail.com");
			WebElement s3 = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
			s3.sendKeys("Naga123");
			if(s2.isDisplayed()) {
				System.out.println("entered gamil address");
			}else {
				System.out.println("Re--enter gamil address");
			}
			driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("Naga@gmail.com");
			
			WebElement defaltday = driver.findElement(By.xpath("//select[@name='birthday_day']/option[@selected='1']"));
		       System.out.println("defaltday "+defaltday.getText());
		       
		       WebElement defaltmonth = driver.findElement(By.xpath("//select[@name='birthday_month']/option[@selected='1']"));
		       System.out.println("defaltmonth "+defaltmonth.getText());
		       
		       WebElement defaltyear = driver.findElement(By.xpath("//select[@name='birthday_year']/option[@selected='1']"));
		       System.out.println("defaltyear "+defaltyear.getText());
			
			WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
			Select days=new Select(day);
			days.selectByVisibleText("28");
			WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
			Select months=new Select(month);
			months.selectByVisibleText("May");
			WebElement faceyear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
			Select fbyears=new Select(faceyear);
			fbyears.selectByVisibleText("1996");
			
			List<WebElement> monthly = driver.findElements(By.xpath("//select[@name='birthday_month']"));
			for(WebElement monthss:monthly) {
				System.out.println(monthss.getText());
				
				WebElement radio = driver.findElement(By.xpath("//input[@name='sex' and @value='1']"));
				radio.click();
				
				String x1="Custom";  //if we want to change gender without changing or writing code of diff gender create this
				String x2="//label[text()='niklesh']"; //create Xpath url own by label
				String x3=x2.replace("niklesh",x1);  //Replace fake url to origin
				System.out.println(x3);
				WebElement x4=driver.findElement(By.xpath(x3)); //insert new created xpath i.e., x3
				x4.click();
				
			
			}
			
	}

}
