package java1;

public class patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   /* for (int i = 1; i <= 5; i++) {
    	
    for (int j = 1; j <= i; j++) {
    	 
    	System.out.print(" "+j);
	}
         System.out.println();
}*/
		
        
        // Printing the upper part
        for (int i = 1; i <= 6; i++) {
            // inner loop to print spaces.
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // inner loop to print value of j.
            for (int j = i; j <= 6; j++) {
                if(j==i||j==6||i==1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
  
            // printing new line for each row
            System.out.println();
        }
  
        // Printing the lower part
        for (int i = 6 - 1; i >= 1; i--) {
            // inner loop to print spaces.
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // inner loop to print value of j.
            for (int j = i; j <= 6; j++) {
                if( j==i||j==6||i==1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            // printing new line for each row
            System.out.println();
        }
    }}