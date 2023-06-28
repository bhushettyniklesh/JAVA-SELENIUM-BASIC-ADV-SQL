package Test6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Test5.facebook2;

public class facebook3 extends facebook2{
	@FindBy(xpath="//a[@data-testid='open-registration-form-button']")
	WebElement creataccount;
	@FindBy(xpath="//input[@name='firstname']")
	WebElement username;
	@FindBy(xpath="//input[@name='lastname']")
	WebElement password;
	@FindBy(xpath="//input[@name='reg_email__']")
	WebElement s2;
	@FindBy(xpath="//input[@name='reg_passwd__']")
	WebElement s3;
	@FindBy(xpath="//input[@name='reg_email_confirmation__']")
	WebElement s4;
	@FindBy(xpath="//select[@name='birthday_day']/option[@selected='1']")
	WebElement defaltday;
	
	
	public facebook3(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
		public void loginfunctions(String usernameval,String passwordval,String firstnameval,String secondnameval) {
		
	    creataccount.click();
		username.sendKeys(firstnameval);
		password.sendKeys(secondnameval);
		s2.sendKeys(usernameval);
		s3.sendKeys(passwordval);
		
		
		if(s2.isDisplayed()) {
			System.out.println("entered gamil address");
		}else {
			System.out.println("Re--enter gamil address");
		}
		
		s4.sendKeys("Naga@gmail.com");
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
			
}}
