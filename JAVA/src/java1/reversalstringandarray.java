package java1;

public class reversalstringandarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s2="niklesh";
		  for (int i = 0;i<s2.length();i++)
		  {
			  System.out.println(s2.charAt(i));
		  }
		String s3="nikleshhselkin";
		String results="";
		for (int i=s3.length()-1;i>=0;i--){
			results=results+s3.charAt(i);
		}
		{
			System.out.println(results);
		}
		if (s3.equals(results))
		{
			System.out.println("given string is palendrom");
		}
		else
		{
			System.out.println("given string is not palendrom");
		}
	}

}
