/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exam.odd;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Odd {
    // Data member
    private int x;

    // Method to read input and check if the number is odd or even
    public void read() {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        x = scanner.nextInt(); // Read the input value

        // Check if the number is odd or even using the if statement
        if (x % 2 == 0) {
            System.out.println(x + " is an even number.");
        } else {
            System.out.println(x + " is an odd number.");
        }

        // Close the scanner
        scanner.close();
    }

    public static void main(String[] args) {
        // Create an object of the Odd class
        Odd oddChecker = new Odd();

        // Call the read method to check if the number is odd or even
        oddChecker.read();
    }
}

