package DataStructures_Collections;

import java.util.*;
import java.util.HashSet;

class Hashset_demo {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list2.add(5);
		list2.add(6);

		set.add(22);
		set.add(44);
		set.add(5);
		set.add(63);

		System.out.println(set.size());

		for (Integer i : set) {
			System.out.println("--->" + i);

		}

	}
}
