import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

    private final String FILE_NAME = "data/students.txt";

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

}