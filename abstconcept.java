abstract class Vehicle {
    // Concrete method: All vehicles have wheels (common trait)
    void startEngine() {
        System.out.println("Engine started...");
    }

    // Abstract method: Every vehicle moves, but we don't know HOW yet
    abstract void move(); 
}

class Car extends Vehicle {
    // We MUST implement move() or the code won't compile
    void move() {
        System.out.println("The car drives on roads.");
    }
}

public class abstconcept {
    public static void main(String[] args) {
        Car car=new Car();
        car.startEngine();
        car.move();
}
}
