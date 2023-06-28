package TestCases;

import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;

import Pages.LoginPage;

public class Excelretrive extends BassClass {
@Test
public void Retrieve() throws FilloException {
	LoginPage login=new LoginPage(driver);
	Recordset recordset=connection.executeQuery("select * from DataSim where Header='simplilearn'");
	recordset.next();
	String username=recordset.getField("username");
	String password=recordset.getField("password");

	login.Loginfunction(username, password);
	
}
}
