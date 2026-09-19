//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher("Dr. Johnny?");
        Student s = new Student("Huz?", t);
        s.printAdvisor();   // "Huz's advisor is Dr. Ahmed"
    }
}