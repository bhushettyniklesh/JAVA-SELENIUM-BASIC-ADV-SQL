package Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BankTestCase {

@Test
public void Test1(){
	System.out.println("---test1 executed");
}
@Test(groups= {"sanity"})
public void Test2() {
	System.out.println("---test2 executed");
}
	@BeforeMethod
	public void method1() {
		System.out.println("Before method1 executed");
	}
	
	@AfterMethod
	public void method2() {
		System.out.println("After method2 executed");
	}
	
}
