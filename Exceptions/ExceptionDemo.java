package Exception;

public class ExceptionDemo {
	public static void main(String []Args)
	{
		int x=67;
		int y=0 ;
		int a[] = new int[10] ;

		 try {
			//System.out.println("Arithmetic error: "+x/y);
			for(int i = 0; i<10; i++) {
				a[i] = i;	}
			System.out.println("---->"+a[1]);    
		 
		 
		 }catch(Exception e1)
	{

		System.out.println("exception caught---->" + e1);
	}
}}
