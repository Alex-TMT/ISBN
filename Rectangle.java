/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exam.rectangle;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Rectangle {

    // Method to calculate and display the area, length, and perimeter
    public void calculate() {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Input: Read length and width of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate the area of the rectangle
        double area = length * width;

        // Calculate the perimeter of the rectangle
        double perimeter = 2 * (length + width);

        // Output: Display the area, perimeter
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);

        // Close the scanner
        scanner.close();
    }

    public static void main(String[] args) {
        // Create an object of Rectangle class
        Rectangle rectangle = new Rectangle();

        // Call the calculate method to display results
        rectangle.calculate();
    }
}
