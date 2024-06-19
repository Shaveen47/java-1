//. Write a Java program to ask a user to input the marks of the five units they did last semester, compute the average and display it on the screen. (Average should be given in two decimal places).
import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Create an array to store the marks of 5 subjects
        int marks[] = new int[5];
        int sum = 0;

        // Ask user for the marks of each subject
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            sum += marks[i];
        }

        // Calculate the average marks
        double average = sum / 5.0;

        // Print the average marks with two decimal places
        System.out.printf("Your average marks are: %.2f", average);
    }
}
