package Collections;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Hashexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		HashSet<String> hash=new HashSet<String>(); // sorting order
		hash.add("jully");
		hash.add("Ram");
		hash.add("Allu");
		hash.add("yesh");
		hash.add(null);
		{
		System.out.println(hash);
		System.out.println(hash.size());
		}
		TreeSet<String> tree=new TreeSet<String>(); // Ascending order 
		tree.add("D");
		tree.add("A");
		tree.add("B");
		tree.add("C");
		System.out.println(tree);
		
		//converting set to list i.e., in argument pass set
		
		ArrayList<String> array=new ArrayList<String>(hash);
		System.out.println(array);
		ArrayList<String> array1=new ArrayList<String>(tree);
		System.out.println(array1);
		

		
	}

}
