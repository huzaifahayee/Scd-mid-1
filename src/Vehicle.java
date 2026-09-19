public class Vehicle {                    // parent / superclass / base class
    protected String brand;
    protected int speed;

    public void accelerate() {
        speed += 10;
    }
}

class Car2 extends Vehicle {        // child / subclass / derived class
    private int doors;             // Car-specific field

    public void openTrunk() {      // Car-specific method
        System.out.println("Trunk opened");
    }
}
