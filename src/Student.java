class Teacher {
    private String name;
    public Teacher(String name) { this.name = name; }
    public String getName() { return name; }
}

public class Student {
    private String name;
    private Teacher advisor;   // ← association: Student "knows" a Teacher

    public Student(String name, Teacher advisor) {
        this.name = name;
        this.advisor = advisor;
    }

    public void printAdvisor() {
        System.out.println(name + "'s advisor is " + advisor.getName());
    }
}