//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car2 c = new Car2();
        c.brand = "Toyota";     // inherited field — accessible because it's `protected`
        c.accelerate();          // inherited method — works even though Car doesn't define it
        c.openTrunk();            // Car's own method
    }
}