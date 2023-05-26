package java1;

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s3="i love my india";
		String results="";
		for (int i=s3.length()-1;i>=0;i--){
			results=results+s3.charAt(i);
		}
		{
			System.out.println(results);
	}
     String s1="i love my india";
     String[] s2=s1.split(" ");
     String arry=" ";
     for(int i=s2.length-1;i>=0;i--)
     {
		arry=arry+s2[i]+" ";
     }
     System.out.println(arry.trim());
	}}
