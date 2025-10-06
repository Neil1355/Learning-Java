package Homework;

public class Car {
    private String brand;
    private int year;

    // Constructor with parameters
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Getter methods
    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
        // Creating objects using constructor
        Car myCar1 = new Car("Toyota", 2020);
        Car myCar2 = new Car("Honda", 2018);

        // Accessing object properties
        System.out.println("My car 1 is a " + myCar1.getBrand() + " made in " + myCar1.getYear());
        System.out.println("My car 2 is a " + myCar2.getBrand() + " made in " + myCar2.getYear());
    }
}
