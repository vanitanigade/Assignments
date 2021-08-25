package collection.arraylist;

import java.util.ArrayList;

public class CopyArrayListToArray {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("pune");
		al.add("mumbai");
		al.add("delhi");
		al.add("london");
		System.out.println(" Actual ArrayList:" + al);
		
		String strAry[] = new String[al.size()];
		al.toArray(strAry);
		for(String s:strAry) {
			System.out.println(s);
		}
	}

}
