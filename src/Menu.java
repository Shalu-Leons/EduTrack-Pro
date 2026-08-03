import java.util.Scanner;

public class Menu {

    private Scanner sc = new Scanner(System.in);
    private StudentManager manager = new StudentManager();

    public void start() {

        int choice;

        do {

            System.out.println("\n==================================");
            System.out.println("        EDUTRACK PRO");
            System.out.println("==================================");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.println("==================================");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    manager.viewStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudent();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    manager.saveStudents();
                    System.out.println("Thank you for using EduTrack Pro.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
    private void addStudent() {

    System.out.println("\n===== Add Student =====");

    System.out.print("Enter Student ID: ");
    int id = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Age: ");
    int age = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter Gender: ");
    String gender = sc.nextLine();

    System.out.print("Enter Department: ");
    String department = sc.nextLine();

    System.out.print("Enter Year: ");
    int year = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter Email: ");
    String email = sc.nextLine();

    System.out.print("Enter Phone: ");
    String phone = sc.nextLine();

    System.out.print("Enter Address: ");
    String address = sc.nextLine();

    System.out.print("Enter CGPA: ");
    double cgpa = sc.nextDouble();

    System.out.print("Enter Attendance: ");
    double attendance = sc.nextDouble();

    Student student = new Student(
            id,
            name,
            age,
            gender,
            department,
            year,
            email,
            phone,
            address,
            cgpa,
            attendance
    );

    manager.addStudent(student);
}
private void searchStudent() {

    System.out.println("\n========== Search Student ==========");

    System.out.print("Enter Student ID: ");
    int id = sc.nextInt();

    Student student = manager.searchStudent(id);

    if (student != null) {
        student.displayDetails();
    } else {
        System.out.println("Student not found!");
    }
}
private void updateStudent() {

    System.out.println("\n========== Update Student ==========");

    System.out.print("Enter Student ID: ");
    int id = sc.nextInt();
    sc.nextLine();

    Student student = manager.searchStudent(id);

    if (student == null) {
        System.out.println("Student not found!");
        return;
    }

    System.out.println("\nEnter New Details");

    System.out.print("Name: ");
    String name = sc.nextLine();

    System.out.print("Age: ");
    int age = sc.nextInt();
    sc.nextLine();

    System.out.print("Gender: ");
    String gender = sc.nextLine();

    System.out.print("Department: ");
    String department = sc.nextLine();

    System.out.print("Year: ");
    int year = sc.nextInt();
    sc.nextLine();

    System.out.print("Email: ");
    String email = sc.nextLine();

    System.out.print("Phone: ");
    String phone = sc.nextLine();

    System.out.print("Address: ");
    String address = sc.nextLine();

    System.out.print("CGPA: ");
    double cgpa = sc.nextDouble();

    System.out.print("Attendance: ");
    double attendance = sc.nextDouble();

    boolean updated = manager.updateStudent(
            id,
            name,
            age,
            gender,
            department,
            year,
            email,
            phone,
            address,
            cgpa,
            attendance
    );

    if (updated) {
        System.out.println("\nStudent updated successfully!");
    } else {
        System.out.println("\nStudent not found!");
    }
}
private void deleteStudent() {

    System.out.println("\n========== Delete Student ==========");

    System.out.print("Enter Student ID: ");
    int id = sc.nextInt();

    boolean deleted = manager.deleteStudent(id);

    if (deleted) {
        System.out.println("\nStudent deleted successfully!");
    } else {
        System.out.println("\nStudent not found!");
    }
}
}