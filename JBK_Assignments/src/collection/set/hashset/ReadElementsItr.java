package collection.set.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class ReadElementsItr {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<>();
		hs.add("pune");
		hs.add("mumbai");
		hs.add("delhi");
		hs.add("sydney");
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
