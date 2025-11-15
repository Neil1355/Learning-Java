
//package inheritance;
import java.util.Scanner;

class netpay {

    String name;
    int number, tdays, thours;
    double hrlyrate, netpay;

    netpay() { // constructor of netpay class
        Scanner sc = new Scanner(System.in);
        tdays = 7;
        hrlyrate = 15;
        System.out.println("Enter your name: ");
        name = sc.next();

        System.out.println("Enter your contact number: ");
        number = sc.nextInt();

        System.out.println("enter your hours worked daily: ");
        thours = sc.nextInt();
    }

    void calculate_salary() {
        netpay = thours * hrlyrate;
        if (thours >= 30) {
            System.out.println("your netsalary this week is: " + netpay);
        } else {
            System.out.println("you have worked overtime this week.");
            System.out.println("admin has approved your overtime schedule. your netpay along with the overtime is: " + netpay);
        }
    }
}

class developer extends netpay {
    int exhours;
    developer(){ //constructor
        super(); // this will call constructor of super class (netpay)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter extra hours of working this week ");
        exhours = sc.nextInt();
    }
    void add_hours() {
        double wages = 23.50;
        double extra_wages = exhours*wages;
	System.out.println("hence,Name: " + name);
        System.out.println("Mob. no." + number);
        netpay = netpay+extra_wages;
        System.out.println("Netpay after addition of hours :" + netpay);

    }
}

