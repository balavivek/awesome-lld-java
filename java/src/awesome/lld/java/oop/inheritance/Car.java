package awesome.lld.java.oop.inheritance;

/**
 * Sub Class or Child class
 * Single Inheritance
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
                + " which has " + this.noOfDoors+" doors";
        System.out.println(message + " is honking ...");
    }

}
