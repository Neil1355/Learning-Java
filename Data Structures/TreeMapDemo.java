package DataStructures_Collections;

import java.util.*;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("Neil", 1305);
		tm.put("Nishi", 2805);
		tm.put("Krish", 1301);
		tm.put("Vansh", 708);

		Set<Map.Entry<String, Integer>> set = tm.entrySet();

		for (Map.Entry<String, Integer> me : set) {
			System.out.print(me.getKey() + " :");
			System.out.println(me.getValue());
		}
		System.out.println();

		Integer balance = tm.get("Nishi");
		tm.put("Nishi", balance + 100);
		
		System.out.println("Nishi's new balance: "+tm.get("Nishi"));
	}
}