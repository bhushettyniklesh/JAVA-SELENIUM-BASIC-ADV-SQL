package javaoops;

public class oops {
 public String name;
 public int empid;
 private static int salary=50000;
 
 public oops()
 {
	 System.out.println("para default");
 }
  public oops(String var1,int var2)
  {
	  System.out.println("para constructor");
	  name=var1;
	  empid=var2;
  }
 public void DispalyName() {
	 System.out.println(name);
 }
 public void Dispalyempid() {
	 System.out.println(empid);
 }
 public static void Dispalysalary() {
	 System.out.println(salary);
	
}
}