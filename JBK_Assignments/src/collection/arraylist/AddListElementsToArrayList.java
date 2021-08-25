package collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class AddListElementsToArrayList {

	public static void main(String[] args) {

		ArrayList<String> arrl = new ArrayList<>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		System.out.println(" Before Actual ArrayList:" + arrl);
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		System.out.println("list elements: " + list);
		System.out.println(" Does ArrayList contains all list elements?: " + arrl.containsAll(list) );

		arrl.addAll(list);
		System.out.println("added list to arraylist");
		System.out.println(" Does ArrayList contains all list elements?: " + arrl.containsAll(list) );

		System.out.println("After Copy/added list to ArrayList: " + arrl);


	}

}
