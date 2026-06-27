class Student {

    int rollNo;
    String name;
    String course;
    float marks;

    // Default Constructor
    Student() {
        rollNo = 101;
        name = "Anshuman";
        course = "Computer Science";
        marks = 92.5f;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Student Details");
        System.out.println("----------------------");
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("Course      : " + course);
        System.out.println("Marks       : " + marks);
    }
}

public class studentsdetailacp {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.displayDetails();

    }
}