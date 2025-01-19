/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exam.grades;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class GRADES {

    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Declare variables for six unit scores and the average
        double[] scores = new double[6];
        double total = 0;
        
        // Input six unit scores
        System.out.println("Enter the scores for six units:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter score for unit " + (i + 1) + ": ");
            scores[i] = scanner.nextDouble();
            total += scores[i];  // Add the score to total
        }
        
        // Calculate the average
        double average = total / 6;
        
        // Output the average
        System.out.println("Average score: " + average);
        
        // Determine the grade based on the average score
        char grade;
        if (average >= 70) {
            grade = 'A';
        } else if (average >= 60) {
            grade = 'B';
        } else if (average >= 50) {
            grade = 'C';
        } else if (average >= 40) {
            grade = 'D';
        } else {
            grade = 'E';
        }
        
        // Output the grade
        System.out.println("The grade for the student is: " + grade);
        
        // Close the scanner
        scanner.close();
    }
}

