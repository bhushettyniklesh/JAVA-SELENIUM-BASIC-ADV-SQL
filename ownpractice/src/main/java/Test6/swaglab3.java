package Test6;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class swaglab3{
	public WebDriver driver;
	public ExtentReports report;
	public ExtentTest test;
	Fillo fillo;
	Connection connection;

	@BeforeTest
	public void reports() throws FilloException {
		report=new ExtentReports("externalreports");
		fillo=new Fillo();
		connection=fillo.getConnection("ownsheet.xlsx");
	}
	
	@BeforeMethod
	public void swag3(Method method) {
		WebDriverManager.firefoxdriver().setup();
		test=report.startTest(method.getName());
		test.log(LogStatus.INFO, "started","ended");
		this.driver=new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
	}
	@AfterTest
	public void test()
	{
		report.endTest(test);
	}
	@AfterMethod
  public void teardo() {
		report.flush();
		driver.close();
	  
  }
}
