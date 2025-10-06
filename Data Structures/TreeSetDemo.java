package DataStructures_Collections;

import java.util.*;

public class TreeSetDemo {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList<String>();
		arr.add("neil");
		arr.add("het");
		arr.add("dev");
		arr.add("kahan");
		arr.add("akshat");

		TreeSet mytreeset = new TreeSet<String>();
		mytreeset.add("Hari");
		mytreeset.add("Adani");
		mytreeset.add("Tanay");
		mytreeset.add("Dhruv");
		mytreeset.add("Naman");
		mytreeset.addAll(arr);
		
		for(Object ts : mytreeset) {
			System.out.println("--->"+ts.toString());
		}
	}
}
