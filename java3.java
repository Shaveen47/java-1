//Write a program that will help kids learn divisibility test of numbers of integers. The program should check whether the given integer is divisible by 2, 3, 5, and 9, printing the log of a number.
import java.util.Scanner;

public class DivisibilityTest {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask user for a number
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is divisible by 2, 3, 5, and 9
        if (number % 2 == 0) {
            System.out.println(number + " is divisible by 2.");
        }
        if (number % 3 == 0) {
            System.out.println(number + " is divisible by 3.");
        }
        if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5.");
        }
        if (number % 9 == 0) {
            System.out.println(number + " is divisible by 9.");
        }
    }
}

