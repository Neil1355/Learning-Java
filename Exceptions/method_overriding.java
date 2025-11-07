class A {
	int i,j ;
	A(int a, int b) {
		i = a;
		j = b;
	}
	void show () {
		System.out.println("i and j: " + i + " " +j) ;
	}
}
class B extends A {
	int k;
	
	B(int a, int b, int c) {
	super(a,b) ;
	k = c;
		System.out.println("K: " +k) ;
	
	}
}
  
public class method_overriding {
public static void main(String[] args) {

B subOB = new B(1, 2, 3) ;

subOB.show ();
}
}

