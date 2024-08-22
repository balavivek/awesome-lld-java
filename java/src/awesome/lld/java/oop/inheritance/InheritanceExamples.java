package awesome.lld.java.oop.inheritance;

/**
 * One class is allowed to inherit fields and methods of another class.
 * Create new class based on existing class
 * The inherited class can have its own method and objects along it can also reuse the method and object from its parent class.
 */
public class InheritanceExamples {

    public static void main(String[] args) {
        Car thar = new Car("Mahindra", 2022, "Thar", 3);
        thar.startEngine();
        thar.honk();
        thar.stopEngine();

        Car bmw = new Car("BMW", 2023, "X1", 5);
        bmw.startEngine();
        bmw.honk();
        bmw.stopEngine();

    }

}

/**
 * Parent class
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

class Car extends Vehicle {
    String model;
    int noOfDoors;

    Car(String brand, int manufactureYear, String model, int noOfDoors) {
        super(brand, manufactureYear);
        this.model = model;
        this.noOfDoors = noOfDoors;
    }

    void honk() {
        String message = super.brand + " " + this.model + " manufacture in " + super.manufactureYear + " which has " + this.noOfDoors;
        System.out.println(message + " is honking ...");
    }

}

