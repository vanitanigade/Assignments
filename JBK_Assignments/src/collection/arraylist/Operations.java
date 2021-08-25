package collection.arraylist;

import java.util.ArrayList;

public class Operations {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("pune");
		al.add("mumbai");
		al.add("delhi");
		
		System.out.println(al);
		System.out.println(al.get(1));	// get elements by index
		System.out.println(al.contains("delhi"));	// does list contains "delhi"
		// add elements at a specific index al.add(2,"PLAY");
		System.out.println(al.isEmpty());
		System.out.println(al.indexOf("mumbai"));
		System.out.println(al.size());
		al.clear();
		System.out.println("after clear arraylist: " + al);
		

		
	}

}
