public class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Flapping wings");
    }
}

class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Using jet engines");
    }
}