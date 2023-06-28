package Test5;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import Test6.facebook3;

public class facebook1 extends facebook2 {
@Test
	public void test5() {

	facebook3 logins=new facebook3(driver);
	logins.loginfunctions("Naga@gmail.com", "Naga123","nagesh","wararao");
		
	List<WebElement> monthly = driver.findElements(By.xpath("//select[@name='birthday_month']"));
	for(WebElement monthss:monthly) {
		System.out.println(monthss.getText());
		
		WebElement radio = driver.findElement(By.xpath("//input[@name='sex' and @value='1']"));
		radio.click();
		
		String x1="Custom";  
		String x2="//label[text()='niklesh']";
		String x3=x2.replace("niklesh",x1);  
		System.out.println(x3);
		WebElement x4=driver.findElement(By.xpath(x3)); 
		x4.click();
		
	}
	
}}
