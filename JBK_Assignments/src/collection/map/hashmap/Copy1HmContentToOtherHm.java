package collection.map.hashmap;
// Program for copy Map content to another HashMap

import java.util.HashMap;

public class Copy1HmContentToOtherHm {
	
	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("first", "pune");
		hm.put("second", "mumbai");
		hm.put("third", "delhi");
		hm.put("four", "kochi");
		System.out.println(hm);

		HashMap<String, String> hm1 = new HashMap<String, String>();
		hm.put("c1", "delhi");
		hm.put("c2", "keral");
		hm.put("c3", "pune");
		
		hm.putAll(hm1);
		System.out.println(hm);
	}
}
