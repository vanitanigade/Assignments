package collection.map.hashmap;

import java.util.HashMap;

public class BasicOperations {

	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("first", "pune");
		hm.put("second", "mumbai");
		hm.put("third", "delhi");
		hm.put("four", "kochi");
		System.out.println(hm);

		System.out.println("value of second: " + hm.get("second"));
		System.out.println("is hashmap empty: " + hm.isEmpty());
		hm.remove("third");
		System.out.println("hashmap after removing third element: " + hm);
		System.out.println("size of hashmap: " + hm.size());
	}

}
