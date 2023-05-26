package javaoops;

public class inherhits extends persons {
public int ssn;
public inherhits() {
	super();
	System.out.println("inside para default inherits");
}

public inherhits(String name,int age,String CountryName,int ssn) {
	super();
	System.out.println("para cons");
	this.name=name;
	this.age=age;
	this.CountryName=CountryName;
	this.ssn=ssn;
}
		public void print() {
			System.out.println(ssn);
	}
		public void print(String Message) {
			System.out.println(Message);
		}
}

