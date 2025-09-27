package Homework;
import java.util.ArrayList;


public class Homework3 {



	public static void main(String[] args) {
	    	 ArrayList <Integer> al = new ArrayList <Integer>();
	    	 al.add(1);
	    	 al.add(2);
	    	 al.add(3);
	    	 al.add(4);
	    	 al.add(5);
	    	 int sum=0;
	    	 System.out.println("------>"+al);
	    	 for(Integer num : al) {
	    		 sum+=num;
	    	 }
	    		 System.out.println("->"+sum);
	    		 
	     
	}
}

