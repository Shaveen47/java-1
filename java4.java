//Write a Java program to display all the multiples of 2, 3, and 7 within the range 71 to 150.

public class Multiples {
    public static void main(String[] args) {
        // Print the header
        System.out.println("Multiples of 2, 3, and 7 within the range 71 to 150:");

        // Loop through the range 71 to 150
        for (int i = 71; i <= 150; i++) {
            // Check if the number is a multiple of 2, 3, or 7
            if (i % 2 == 0 || i % 3 == 0 || i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}

