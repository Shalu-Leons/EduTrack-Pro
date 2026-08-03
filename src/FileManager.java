import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

    private final String FILE_NAME = "data/students.txt";

    // ==========================
    // Save Students
    // ==========================
    public void saveStudents(ArrayList<Student> students) {

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME));

            for (Student student : students) {
                writer.write(student.toFileString());
                writer.newLine();
            }

            writer.close();

            System.out.println("Student data saved successfully.");

        } catch (IOException e) {
            System.out.println("Error while saving file.");
        }
    }

    // ==========================
    // Load Students
    // ==========================
    public ArrayList<Student> loadStudents() {

        ArrayList<Student> students = new ArrayList<>();

        try {

            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                Student student = new Student(
                        Integer.parseInt(data[0]),
                        data[1],
                        Integer.parseInt(data[2]),
                        data[3],
                        data[4],
                        Integer.parseInt(data[5]),
                        data[6],
                        data[7],
                        data[8],
                        Double.parseDouble(data[9]),
                        Double.parseDouble(data[10])
                );

                students.add(student);
            }

            reader.close();

        } catch (IOException e) {

            System.out.println("No previous student records found.");

        }

        return students;
    }
}