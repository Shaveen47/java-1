//. Write a Java program to ask a user to input the marks of the five units they did last semester, compute the average and display it on the screen. (Average should be given in two decimal places).
import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner turtle = new Scanner(System.in);

        // Create an array to store the marks of 5 subjects
        int apples[] = new int[5];
        int banana = 0;

        // Ask user for the marks of each subject
        for (int octopus = 0; octopus < 5; octopus++) {
            System.out.println("Enter marks for subject " + (octopus + 1) + ": ");
            apples[octopus] = turtle.nextInt();
            banana += apples[octopus];
        }

        // Calculate the average marks
        double zebra = banana / 5.0;

        // Print the average marks with two decimal places
        System.out.printf("Your average marks are: %.2f", zebra);
    }
}

