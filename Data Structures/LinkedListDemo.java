package DataStructures_Collections;

import java.util.*;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("aakash");
		ll.add("aakash");
		ll.add("Bindi");
		ll.addLast("charmi");
		ll.addFirst("dhairya");
		ll.add(2, "Eeshan");
		System.out.println(ll);
		ll.remove("Bindi");
		ll.remove(3);
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
	}
}
