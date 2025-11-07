import java.util.Scanner;

public class shape {

    double length, lengthr, breadth, breadthr, radius, pi = 3.14, squarearea, rectanglearea, circlearea;
    int answer;

    void getdata() {

        System.out.println("select a shape: ");
        System.out.println("1. square 2. rectangle 3. Circle");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:

                answer = 1;
                System.out.println("type the length of the square to calculate area");
                length = sc.nextDouble();
                squarearea = length * length;
                System.out.println("the area of square is: " + squarearea);
                break;

            case 2:

                answer = 2;
                System.out.println("type the length for the rectangle: ");
                lengthr = sc.nextDouble();
                System.out.println("type in the breadth of the rectangle: ");
                breadthr = sc.nextDouble();
                rectanglearea = lengthr * breadthr;
                System.out.println("the area of the rectangle is: " + rectanglearea);
                break;

            case 3:

                answer = 3;
                System.out.println("type in the radius of the circle: ");
                radius = sc.nextDouble();
                circlearea = pi*radius*radius;
                System.out.println("the area of the cicle is: " + circlearea);
                break;

            default:
                System.out.println("wrong choice selected");
        }
    }

    public static void main(String[] arg)
    {
	shape obj = new shape() ; 
	obj.getdata();
}
}