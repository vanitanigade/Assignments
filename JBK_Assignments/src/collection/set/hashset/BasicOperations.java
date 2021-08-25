package collection.set.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class BasicOperations {
	
	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<>();
		hs.add("pune");
		hs.add("mumbai");
		hs.add("delhi");
		hs.add("sydney");
		
		System.out.println(hs);
		System.out.println(" HashSet is empty or not= " + hs.isEmpty());
		hs.remove("mumbai");
		System.out.println(hs);
		System.out.println(" Size of HashSet= " + hs.size());
		System.out.println(" Does HashSet contains first element= " + hs.contains("pune"));


		
	}


}
