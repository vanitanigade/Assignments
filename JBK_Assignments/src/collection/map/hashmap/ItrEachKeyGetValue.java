package collection.map.hashmap;
// Program for Iterating through each key get corresponding value object

import java.util.HashMap;
import java.util.Set;

public class ItrEachKeyGetValue {

	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("first", "pune");
		hm.put("second", "mumbai");
		hm.put("third", "delhi");
		hm.put("four", "kochi");
		
		Set<String> keyset = hm.keySet();
		for(String key:keyset) {
			System.out.println("value of " + key + " is " + hm.get(key));
		}
		
	//	hm.forEach((k,v) -> System.out.println(k) );
	}

}
