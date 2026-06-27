class Vehicle {

    // Method Overloading
    void start() {
        System.out.println("Vehicle is starting...");
    }

    void start(String keyType) {
        System.out.println("Vehicle starts using " + keyType);
    }

    // Method to be overridden
    void drive() {
        System.out.println("Vehicle is moving.");
    }
}

// Child Class
class Car extends Vehicle {

    // Method Overriding
    @Override
    void drive() {
        System.out.println("Car is driving on the road.");
    }
}

public class testyourskill {

    public static void main(String[] args) {

        Car obj = new Car();

        // Method Overloading
        obj.start();
        obj.start("Smart Key");

        // Method Overriding
        obj.drive();
    }
}