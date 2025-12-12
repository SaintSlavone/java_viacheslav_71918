import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

//version 2 with HashSet
public class EmployeeReaderHashSet {
    public static void main(String[] args) {
        HashSet<String> employees = new HashSet<>();
        String filePath = "employees.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                employees.add(line.trim());
            }
            System.out.println("File successfully read!");
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
            return;
        }

        System.out.println("\n=== Collection Size ===");
        System.out.println("Total number of unique employees: " + employees.size());

        System.out.println("\n=== Method 1: Standard for loop (using array conversion) ===");
        String[] employeeArray = employees.toArray(new String[0]);
        for (int i = 0; i < employeeArray.length; i++) {
            System.out.println((i + 1) + ". " + employeeArray[i]);
        }

        System.out.println("\n=== Method 2: For-each loop ===");
        int counter = 1;
        for (String employee : employees) {
            System.out.println(counter + ". " + employee);
            counter++;
        }

        System.out.println("\n=== Method 3: Iterator interface ===");
        Iterator<String> iterator = employees.iterator();
        int iteratorCounter = 1;
        while (iterator.hasNext()) {
            String employee = iterator.next();
            System.out.println(iteratorCounter + ". " + employee);
            iteratorCounter++;
        }

        System.out.println("\n=== Checking if specific employees exist using contains() ===");
        String[] checkEmployees = {"John Smith", "Anna Taylor", "Mark Johnson"};
        for (String name : checkEmployees) {
            if (employees.contains(name)) {
                System.out.println("✓ " + name + " exists in the collection");
            } else {
                System.out.println("✗ " + name + " does NOT exist in the collection");
            }
        }
    }
}