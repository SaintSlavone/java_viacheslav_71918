package Task2_lambda;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StudentReader {
    public static ArrayList<Student> readStudentsFromFile(String filePath) {
        ArrayList<Student> students = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] parts = line.trim().split("\\s+");

                if (parts.length >= 3) {
                    String name = parts[0];
                    String surname = parts[1];
                    int score = Integer.parseInt(parts[2]);

                    Student student = new Student(name, surname, score);
                    students.add(student);
                }
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error parsing score: " + e.getMessage());
        }

        return students;
    }
}