package Exception;

import java.util.Scanner;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		int a[] = new int[10];
		int i, number;
		Scanner sc = new Scanner(System.in) ;
		
			try {
				
				for (i = 0; i < 10; i++) {
					System.out.println("choose a number: ");
					number = sc.nextInt() ;
				if(number<100) {
					throw new Exception("number too small.");
				}
				a[i] = number;
				System.out.println("----->" + a[i]);
			}
		
		}
		
		 catch (Exception e1) {
			System.out.println("Exception caught --->" + e1);

		}

	}

}
