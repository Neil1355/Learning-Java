import java.util.Scanner;
public class Addition2 {
public static void main(String args[]) {
 double pi = 3.14 , area ;
	
	int radius ;
	Scanner sc = new Scanner(System.in);
	radius = sc.nextInt();
	area = pi*radius*radius;
	System.out.println("The area is "+area);
	
	
}
}
