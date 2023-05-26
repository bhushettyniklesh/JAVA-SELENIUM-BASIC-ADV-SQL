package java1;

public class primenumbers {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int number= 43;
       boolean flag=true;
       for(int i=2;i<=number/2;i++)
       {
    	 int rem=number%i;
    	 if(rem==0) {
    		 
    		 flag=false;
    		 break;
    	 }
       }
       if (flag==true){
    	   System.out.println("prime number");
       }else {
    	   System.out.println("not prime number");
       }
	}
	
}
