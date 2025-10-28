

class box {
	double height;
	double width;
	double length ;
}
public class boxdemo{
	public static void main(String[] args) {
		box mybox1 = new box() ;
		box mybox2 = new box() ;
		double vol ;
		
		mybox1.width = 10;
		mybox1.height = 5 ;
		mybox1.length = 15 ;
		
		mybox2.width = 8;
		mybox2.height = 4;
		mybox2.length = 10;
		
		vol = mybox1.width * mybox1.height * mybox1.length ;
		System.out.println("the volume of box 1 is : "+vol);
		
		vol = mybox2.height * mybox2.length * mybox2.width ;
		System.out.println("the volume of box 2 is: "+vol) ;
		
		
	}
}

