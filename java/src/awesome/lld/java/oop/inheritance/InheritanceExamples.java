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
        thar.honk(); // Output: Mahindra Thar manufacture in 2022 which has 3 doors is honking ...
        thar.stopEngine();// Output: Engine Stopped

        Car fortuner = new Car("Toyota", 2023, "Fortuner", 5);
        fortuner.startEngine();// Output: Engine started
        fortuner.honk();// Output: Toyota Fortuner manufacture in 2023 which has 5 doors is honking ...
        fortuner.stopEngine();// Output: Engine Stopped


        LuxuryCar bmw = new LuxuryCar("BMW ", 2024, "7 Series", 5, "ventilated ");
        bmw.startEngine(); // Output: Engine started
        bmw.honk(); // Output: BMW 7 Series manufacture in 2024 which has 5 doors is honking ...
                    // ventilated  activated !
        bmw.stopEngine(); // Output: Engine Stopped

    }

}





