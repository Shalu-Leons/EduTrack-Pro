import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students;
private FileManager fileManager;

public StudentManager() {

    fileManager = new FileManager();

    students = fileManager.loadStudents();

}
    
    public void addStudent(Student student) {

    students.add(student);

    saveStudents();

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
public Student searchStudent(int id) {

    for (Student student : students) {

        if (student.getId() == id) {
            return student;
        }

    }

    return null;
}
public boolean updateStudent(int id, String name, int age, String gender,
                             String department, int year,
                             String email, String phone,
                             String address, double cgpa,
                             double attendance) {

    Student student = searchStudent(id);

    if (student != null) {

        student.setName(name);
        student.setAge(age);
        student.setGender(gender);
        student.setDepartment(department);
        student.setYear(year);
        student.setEmail(email);
        student.setPhone(phone);
        student.setAddress(address);
        student.setCgpa(cgpa);
        student.setAttendance(attendance);
        saveStudents();
        return true;
    }

    return false;
}
public boolean deleteStudent(int id) {

    Student student = searchStudent(id);

    if (student != null) {
        students.remove(student);
        saveStudents();
        return true;
    }

    return false;
}
public void saveStudents() {

    fileManager.saveStudents(students);

}
}