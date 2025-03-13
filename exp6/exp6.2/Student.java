public class Student {
    private String name;
    private double marks;

    // Constructor
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    // toString method to display the student's details (for debugging)
    @Override
    public String toString() {
        return "Student{name='" + name + "', marks=" + marks + "}";
    }
}
