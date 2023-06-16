package Seleniumproj;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HtmlTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.gecko.driver","geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.get("https://www.w3schools.com/html/html_tables.asp");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  List<WebElement> rows=driver.findElements(By.cssSelector("table#customers>tbody>tr"));//css selector
		  System.out.println("total number of rows "+ rows.size());
		  List<WebElement> column=driver.findElements(By.cssSelector("table#customers>tbody>tr>th")); //css selector
		  System.out.println("total number of column "+ column.size());
		  
		  //by using Css selector select 5th row 1st column
		 WebElement data=driver.findElement(By.cssSelector("table#customers>tbody>tr:nth-of-type(5)>td:nth-of-type(1)")); //css selector
		  System.out.println("total number of column "+ data.getText());
		  
		  //by using Xpath select 6th row 3rd column
		  WebElement data1=driver.findElement(By.xpath("//table[@id='customers']//tr[6]//td[3]"));
		  System.out.println("total number of column "+ data1.getText());
		  
		  //print all table data
		   for (int i=2;i<=rows.size();i++) {
			   List<WebElement>columndata1=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[" +i+ "]/td"));
				  System.out.println(columndata1.get(0).getText()+"  "+columndata1.get(1).getText()+"  "+columndata1.get(2).getText());
			
		   
		   }
		  
	}

}
