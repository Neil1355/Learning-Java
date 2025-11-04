import java.util.Scanner;

public class Autobox {

	static String word;
	static int a;

	public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("type in the word: ");
 word =  sc.next();
String str = word ;
 System.out.println(str.length());
	a = str.length()/2;
	if(a+1 == a-1) {
		System.out.println("True");
	}else {System.out.println("false");
}

	
	}
}