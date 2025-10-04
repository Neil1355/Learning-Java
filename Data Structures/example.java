package DataStructures_Collections;

import java.util.*;

class example {
	
	public static void main(String[] args) {
		
		PriorityQueue<Integer> Q = new PriorityQueue<Integer>();
 
Q.add(6);
Q.add(13);
Q.add(20);
Q.add(3);
System.out.println("Q");

System.out.println(Q.peek());
System.out.println(Q.poll());
System.out.println(Q.peek());
System.out.println(Q);

	}

}

