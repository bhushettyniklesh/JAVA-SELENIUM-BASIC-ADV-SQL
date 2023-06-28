package TestCases;


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

public class BassClass {
   
	public WebDriver driver;
	public ExtentReports report;
	public ExtentTest test;
	Fillo fillo;
	Connection connection;
	
	@BeforeTest
	public void externalreport() throws FilloException
	{
		report=new ExtentReports("ExtentReport.html");
		fillo=new Fillo();
		connection=fillo.getConnection("datasheet.xlsx");
		
	}
	
	@BeforeMethod
	public void TearUp(Method method) {
		WebDriverManager.firefoxdriver().setup();
		
		test = report.startTest(method.getName());
		test.log(LogStatus.INFO, "test case should be started", "succesfully completed");
		
		this.driver=new FirefoxDriver();  //initialize with this. if required or ignore.
		driver.get("https://www.simplilearn.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
	}
	
	@AfterMethod
	public void TearDown() {
		report.endTest(test);
		driver.quit();
		
	}
	@AfterTest
	public void exitreports() {
		report.flush();
		report.close();
	}
}
