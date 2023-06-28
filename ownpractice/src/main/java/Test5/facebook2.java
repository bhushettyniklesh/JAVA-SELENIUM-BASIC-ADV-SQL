package Test5;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook2 {
	
	public ExtentReports report;
	public ExtentTest test;
	
  public WebDriver driver;
	@BeforeTest
  public void reports() {
	  report=new ExtentReports("externalreport.html");
  }	
  
	@BeforeMethod
	public void login(Method method) {
		WebDriverManager.firefoxdriver().setup();
		test= report.startTest(method.getName());
		test.log(LogStatus.INFO, "execution started", "succesfully completed");
		
		this.driver=new FirefoxDriver();
		  driver.get("https://www.facebook.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@AfterMethod
	public void teardown() {
		report.endTest(test);
		driver.quit();
	}
	@AfterTest
	public void generate() {
		report.flush();
		report.close();
	}
}
