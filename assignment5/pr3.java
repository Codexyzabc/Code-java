/*3. Write a program to create a class named Vehicle having protected instance variables 
regnNumber, speed, color, ownerName and a method showData ( ) to show “This is a vehicle 
class”. Inherit the Vehicle class into subclasses named Bus and Car having individual private 
instance variables routeNumber in Bus and manufacturerName in Car and both of them 
having showData ( ) method showing all details of Bus and Car respectively with content of 
the super class’s showData ( ) method*/



package assignment5;

class Vehicle {
    protected int regnNumber;
    protected int speed;
    protected String color;
    protected String ownerName;

    public Vehicle(int regnNumber, int speed, String color, String ownerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    public void showData() {
        System.out.println("This is a vehicle class");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner: " + ownerName);
    }
}

class Bus extends Vehicle {
    private int routeNumber;

    public Bus(int regnNumber, int speed, String color, String ownerName, int routeNumber) {
        super(regnNumber, speed, color, ownerName);
        this.routeNumber = routeNumber;
    }

    
    public void showData() {
        super.showData();
        System.out.println("Route Number: " + routeNumber);
    }
}

class Car extends Vehicle {
    private String manufacturerName;

    public Car(int regnNumber, int speed, String color, String ownerName, String manufacturerName) {
        super(regnNumber, speed, color, ownerName);
        this.manufacturerName = manufacturerName;
    }

    
    public void showData() {
        super.showData();
        System.out.println("Manufacturer Name: " + manufacturerName);
    }
}

public class pr3 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(11023, 45, "orange", "sou");
        Bus bus = new Bus(54682, 67, "blue", "viki", 6);
        Car car = new Car(56897, 66, "violet", "oran", "aston-martin");

        System.out.println("Vehicle Details:");
        vehicle.showData();

        System.out.println("\nBus Details:");
        bus.showData();

        System.out.println("\nCar Details:");
        car.showData();
    }
}


/*OUTPUT 

Vehicle Details:
This is a vehicle class
Registration Number: 11023
Speed: 45
Color: orange
Owner: sou

Bus Details:
This is a vehicle class
Registration Number: 54682
Speed: 67
Color: blue
Owner: viki
Route Number: 6

Car Details:
This is a vehicle class
Registration Number: 56897
Speed: 66
Color: violet
Owner: oran
Manufacturer Name: aston-martin
*/