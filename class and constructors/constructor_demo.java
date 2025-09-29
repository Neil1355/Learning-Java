import java.util.Scanner;

class student {
String name ;
int rollno ;
String grade ;
student() {
	Scanner sc = new Scanner (System.in) ;
			System.out.println("Enter your name: ") ;
			name = sc.next() ;
			System.out.println("Enter your roll no.") ;
			rollno = sc.nextInt() ;
			System.out.println("Enter your grade: ") ;
			grade = sc.next() ;
			}

void display() {
System.out.println("so as per the details provided, the name is "+name+ " roll no. is "+rollno+ " and grade is "+grade ) ;
}
}
public class constructor_demo  {

	public static void main(String[] args ) {
	student stud = new student() ;
	stud.display() ;
		

}
}