package Testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class axisbankdeposited {

	@Test
	public void test4() {
		System.out.println("---test4 is executed");
	}
	@AfterMethod
	public void method3() {
		System.out.println("method 3 is executed");
	}
	@AfterClass
	public void class3() {
		System.out.println("class 3 is executed");
	}
}
