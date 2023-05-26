package Collections;

import java.util.HashMap;

public class HashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  HashMap<String,Integer> s2=new HashMap<String,Integer>();
  s2.put("mango", 1);
  s2.put("apple", 4);
  s2.put("graps", 2);
  s2.put("potato", 3);
  System.out.println(s2);
  s2.put("potato", 5);
  System.out.println(s2);
  s2.remove("potato", 5);
  System.out.println(s2);
  
  for(String fruits:s2.keySet())
  {
	  System.out.println(fruits);  //print only strings
	  System.out.println(s2.get(fruits));  //print strings and number
  }
  for(Integer val: s2.values()) {
	  System.out.println(val);   //print only numbers
  }
  
  
  String str="clean world green world happy world";
  String[] s3=str.split(" ");
  HashMap<String,Integer> s4=new HashMap<String,Integer>();
  for(String word:s3)
  {
	  if(!s4.keySet().contains(word)) {
		  s4.put(word,1);
	  }else
	  {
		  s4.put(word, s4.get(word)+1);
	  }
  }
  System.out.println(s4);
	}

}
