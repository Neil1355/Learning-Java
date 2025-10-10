package Exception;

public class NestTry {
	public static void main(String[] args) {
try {
	int a = 0;
	int b = 42/a ;
	
	try {
		if(a==1)
			a=a/(a-a);
		
		if(a==2){
			int [] c = {1,2,3};
			c[42] = 99;
			
	            }
	    }catch(ArrayIndexOutOfBoundsException e) {
	    	System.out.println("Array index Out-Of-Bounds: " +e);
	    } 
	System.out.println("a= "+a);
	    }catch(ArithmeticException e) {
	    	System.out.println("Divided by 0: "+e);
	    }
     }
}
