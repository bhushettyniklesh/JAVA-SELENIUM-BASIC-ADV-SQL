package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class creatingdata {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
	     
	     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root");
	     Statement sts= con.createStatement();
	     
	     sts.executeUpdate("insert into eproduct(name,price,date_added)values('vegitables',10098.88,now())");
	     
	     System.out.println("data inserted");
	     
	    ResultSet rst= sts.executeQuery("select * from eproduct");
	    
	    while(rst.next()) {
	    	System.out.println(rst.getInt("ID"));
	    	System.out.println(rst.getString("name"));
	    }
	}

}
