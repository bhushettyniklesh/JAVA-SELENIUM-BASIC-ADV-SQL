package Dmo__001;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTest {
  @Test(dataProvider = "Credentials")
  public void f(String username, String Password) {
  }

  @DataProvider(name="credentials")
  public Object[][] getData() {
    return Object[][] data = new Object[3][2]; 
      data[0][0] = "hari";
      data[0][1]="naveen";
      
      data[1][1]="krisha";
      data[1][0]="ram";
      
      data [2][1]="vijay";
      data[][]="ramu";
      
      return data;  
  }
}
