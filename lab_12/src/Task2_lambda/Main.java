package Task2_lambda;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String filePath = "studentsGroup5.txt";
        ArrayList<Student> students = StudentReader.readStudentsFromFile(filePath);

        if (students.isEmpty()) {
            System.out.println("No students loaded. Please check the file path.");
            System.out.println("Creating sample data for demonstration...\n");

            students.add(new Student("John", "Smith", 5));
            students.add(new Student("Emma", "Johnson", 4));
            students.add(new Student("Michael", "Williams", 5));
            students.add(new Student("Sarah", "Brown", 3));
            students.add(new Student("David", "Jones", 5));
            students.add(new Student("Lisa", "Davis", 4));
            students.add(new Student("James", "Miller", 2));
            students.add(new Student("Anna", "Wilson", 5));
        }

        System.out.println("All students:");
        students.forEach(System.out::println);
        System.out.println();

        System.out.println("Students with score 5:");
        students.stream()
                .filter(student -> student.getScore() == 5)
                .forEach(System.out::println);
        System.out.println();

        double averageScore = students.stream()
                .mapToInt(Student::getScore)
                .average()
                .orElse(0.0);
        System.out.println("Average score: " + String.format("%.1f", averageScore));
        System.out.println();

        long countScore5 = students.stream()
                .filter(student -> student.getScore() == 5)
                .count();
        System.out.println("Number of students with score 5: " + countScore5);
    }
}
