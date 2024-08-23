package awesome.lld.java.oop.inheritance;

/**
 * One class is allowed to inherit properties and methods of another class, called super class or parent class.
 * Create new class based on existing class, this new class is called subclass or child class.
 * The inherited class can have its own method and objects along it can also reuse the method and object from its parent class.
 */
public class InheritanceExamples {

    public static void main(String[] args) {
        Car thar = new Car("Mahindra", 2022, "Thar", 3);
        thar.startEngine(); // Output: Engine started
        thar.honk(); // Output: Mahindra Thar manufacture in 2022 which has 3 is honking ...
        thar.stopEngine();// Output: Engine Stopped

        Car bmw = new Car("BMW", 2023, "X1", 5);
        bmw.startEngine();// Output: Engine started
        bmw.honk();// Output: BMW X1 manufacture in 2023 which has 5 is honking ...
        bmw.stopEngine();// Output: Engine Stopped

    }

}

/**
 * Super class or Parent class
 */
class Vehicle {
    String brand;
    int manufactureYear;

    Vehicle(String brand, int manufactureYear) {
        this.brand = brand;
        this.manufactureYear = manufactureYear;
    }

    void startEngine() {
        System.out.println("Engine started");
    }

    void stopEngine() {
        System.out.println("Engine Stopped");
    }

}

/**
 * Sub Class or Child class
 */
class Car extends Vehicle {
    String model;
    int noOfDoors;

    Car(String brand, int manufactureYear, String model, int noOfDoors) {
        super(brand, manufactureYear);
        this.model = model;
        this.noOfDoors = noOfDoors;
    }

    void honk() {
        String message = super.brand + " " + this.model + " manufacture in " + super.manufactureYear
                + " which has " + this.noOfDoors;
        System.out.println(message + " is honking ...");
    }

}

