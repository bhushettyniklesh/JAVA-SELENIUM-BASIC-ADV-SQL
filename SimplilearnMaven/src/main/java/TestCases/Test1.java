package TestCases;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
public class Test1 extends BassClass {
  
	@Test
	public void test2() {
		LoginPage Page=new LoginPage(driver);
		
		Page.Loginfunction("xvr@gmail.com","Niklesh#123674");
		
		WebElement errors =driver.findElement(By.id("msg_box"));
		String actualerror =errors.getText();
		String expectederror="The email or password you have entered is invalid.";
		Assert.assertEquals(actualerror, expectederror);
		
	}
	@Test(enabled=false)
	public void test3() {
		LoginPage Page=new LoginPage(driver);
		Page.Loginfunction("xvur@gmail.com","Niklesh#123674");
		
	}
	
}
