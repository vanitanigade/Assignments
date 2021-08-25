package collection.set.hashset;

import java.util.HashSet;

public class RetainSameElemntsOf2Hset {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<>();
		hs.add("pune");
		hs.add("mumbai");
		hs.add("delhi");
		hs.add("sydney");
		System.out.println("first hashset: " + hs);

		HashSet<String> subSet = new HashSet<>();
		subSet.add("pune");
		subSet.add("london");
		subSet.add("paris");
		subSet.add("sydney");
		System.out.println("second hashset: " + subSet);
		
		hs.retainAll(subSet);
		System.out.println("Common Hashset content from both:" + hs);

		
		
		

	}
}
