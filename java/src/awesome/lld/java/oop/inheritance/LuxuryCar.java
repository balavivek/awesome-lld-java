package awesome.lld.java.oop.inheritance;

public class LuxuryCar extends Car {
    String seats;

    LuxuryCar(String brand, int manufactureYear, String model, int noOfDoors, String seats){
        super(brand,manufactureYear,model,noOfDoors);
        this.seats = seats;
    }

    void activateSeat(){
        System.out.println(seats+" activated !");
    }

    void honk() {
        super.honk();
        activateSeat();
    }
}
