import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();
        String input;
        
        // Prompt user to enter grades
        System.out.println("Enter student grades (type 'done' to finish):");
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                double grade = Double.parseDouble(input);
                grades.add(grade);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid grade or 'done' to finish.");
            }
        }
        
        // Check if grades list is not empty
        if (grades.isEmpty()) {
            System.out.println("No grades were entered.");
        } else {
            // Calculate average, highest, and lowest grades
            double sum = 0.0;
            double highest = grades.get(0);
            double lowest = grades.get(0);
            
            for (double grade : grades) {
                sum += grade;
                if (grade > highest) {
                    highest = grade;
                }
                if (grade < lowest) {
                    lowest = grade;
                }
            }
            
            double average = sum / grades.size();
            
            // Display results
            System.out.printf("Average grade: %.2f%n", average);
            System.out.printf("Highest grade: %.2f%n", highest);
            System.out.printf("Lowest grade: %.2f%n", lowest);
        }
        
        scanner.close();
    }
}
