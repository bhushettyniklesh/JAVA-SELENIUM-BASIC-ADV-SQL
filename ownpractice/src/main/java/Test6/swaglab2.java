package Test6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;

import Test5.swaglab1;

public class swaglab2 extends swaglab3{
	
@Test
public void lab1() throws FilloException {
	swaglab1 lab3=new swaglab1(driver);
	Recordset recordset=connection.executeQuery("select * from swagsheet where Header='lab1'");
	recordset.next();
	String user=recordset.getField("Username");
	String pass=recordset.getField("Password");
	lab3.swag1(user, pass);
	WebElement d2=driver.findElement(By.xpath("//h3[@data-test='error']"));
	String actual=d2.getText();
	String expected="Epic sadface: Username and password do not match any user in this service";
	Assert.assertEquals(actual,expected);
	
}
@Test
public void lab2() throws FilloException {

	swaglab1 lab4=new swaglab1(driver);
	Recordset recordset=connection.executeQuery("select * from swagsheet where Header='lab2'");
	recordset.next();
	String usere=recordset.getField("Username");
	String passe=recordset.getField("Password");
	lab4.swag1(usere, passe);
	String actual=driver.getCurrentUrl();
	String expected="https://www.saucedemo.com/inventory.html";
	Assert.assertEquals(actual,expected);
}}
