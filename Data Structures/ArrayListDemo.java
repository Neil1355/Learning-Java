package DataStructures_Collections;

import java.util.ArrayList;

public class ArrayListDemo {
     public static void main(String[] args) {
    	 ArrayList <Integer> al = new ArrayList <Integer>();
    	 al.add(11);
    	 al.add(22);
    	 al.add(33);
    	 al.add(44);
    	 al.add(55);
    	 int sum=0;
    	 System.out.println("------>"+al);
    	 for(Integer num : al) {
    		 sum+=num;
    	 }
    		 System.out.println("->"+sum);
    		 
     }
}
