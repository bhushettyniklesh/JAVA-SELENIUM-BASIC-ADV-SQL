package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"ravi","raj","money","bunny"};
		 
		 System.out.println(names[3]);
		 
		 
		 ArrayList<String> list1=new ArrayList<String>();
		 list1.add("krush");
		 list1.add("junny");
		 list1.add("zuba");
		 list1.add("guzzu");
		 System.out.println(list1.size());
		 System.out.println(list1.get(2));
		 System.out.println(list1.get(list1.size()-1));
		 System.out.println(list1);
		 
		 list1.set(1,"holy");   //to replace any string
		 System.out.println(list1);
		 
		 list1.add(3, "fully");  ///to add any new String in a place of index
		 System.out.println(list1);
		 
		 list1.remove(3);  //remove unwanted string
		 System.out.println(list1);
		 
		 //iterate through the list important interview question
		 
		 for(int i=0;i<list1.size();i++){   //for loop
			 
			 System.out.println(list1.get(i));
	}
		 for(String value:list1) {          
			 System.out.println(list1);
		 }
			 
		 Iterator<String> itr=list1.iterator();  //each loop
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 Collections.sort(list1);  //sorting
		 {
			 System.out.println(list1);
		 }
		 Collections.reverse(list1);   //reverse order
		 {
			 System.out.println(list1);
		 }
			 
	}
}
