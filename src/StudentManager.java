import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }
    public void addStudent(Student student) {
    students.add(student);
    System.out.println("Student added successfully!");
}
public void viewStudents() {

    if (students.isEmpty()) {
        System.out.println("No students found.");
        return;
    }

    for (Student student : students) {
        student.displayDetails();
    }
}

}