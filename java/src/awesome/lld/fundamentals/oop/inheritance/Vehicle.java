package awesome.lld.fundamentals.oop.inheritance;

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
