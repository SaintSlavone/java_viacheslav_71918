import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//version 4 with ArrayList Class
public class EmployeeReader {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
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

        System.out.println("\n=== Collection Size (with duplicates) ===");
        System.out.println("Total number of employees: " + employees.size());

        System.out.println("\n=== Original order (as read from file) ===");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println((i + 1) + ". " + employees.get(i));
        }

        Collections.sort(employees);

        System.out.println("\n=== Sorted A to Z (using Collections.sort()) ===");
        System.out.println("\n--- Method 1: Standard for loop ---");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println((i + 1) + ". " + employees.get(i));
        }

        System.out.println("\n--- Method 2: For-each loop ---");
        int counter = 1;
        for (String employee : employees) {
            System.out.println(counter + ". " + employee);
            counter++;
        }

        System.out.println("\n--- Method 3: Iterator interface ---");
        Iterator<String> iterator = employees.iterator();
        int iteratorCounter = 1;
        while (iterator.hasNext()) {
            String employee = iterator.next();
            System.out.println(iteratorCounter + ". " + employee);
            iteratorCounter++;
        }

        Collections.reverse(employees);

        System.out.println("\n=== Sorted Z to A (using Collections.reverse()) ===");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println((i + 1) + ". " + employees.get(i));
        }
    }
}