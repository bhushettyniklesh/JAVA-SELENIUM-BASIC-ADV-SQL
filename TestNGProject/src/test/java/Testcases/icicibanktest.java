package Testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class icicibanktest{
   @BeforeClass
	public void Class1() {
		System.out.println("Before executed class 1");
	}
	
   @AfterClass
	public void Class2() {
		System.out.println("After executed class 2");
	}
}
