package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ReadElementsItr {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("pune");
		al.add("mumbai");
		al.add("delhi");
		al.add("london");
		al.add("sydney");
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
