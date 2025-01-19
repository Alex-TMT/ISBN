/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exam.student;

/**
 *
 * @author USER
 */
import java.util.Scanner;

class Student {
    int Adm_no;           // Admission number
    String Sname;         // Student name (up to 20 characters)
    float OOP_marks;      // Marks in OOP
    float Calculus_marks; // Marks in CALCULUS
    float SAD_marks;      // Marks in SAD
    float Total;          // Total marks

    // Function to calculate total marks
    public void calctotal() {
        Total = OOP_marks + Calculus_marks + SAD_marks;
    }

    // Function to accept values
    public void getdata() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Admission Number: ");
        Adm_no = sc.nextInt();
        
        sc.nextLine(); // Consume the newline character left by nextInt()
        
        System.out.print("Enter Student Name: ");
        Sname = sc.nextLine();
        
        System.out.print("Enter Marks in OOP: ");
        OOP_marks = sc.nextFloat();
        
        System.out.print("Enter Marks in CALCULUS: ");
        Calculus_marks = sc.nextFloat();
        
        System.out.print("Enter Marks in SAD: ");
        SAD_marks = sc.nextFloat();
        
        calctotal();  // Call to calculate total marks
    }

    // Function to display all data members
    public void displaydata() {
        System.out.println("Admission Number: " + Adm_no);
        System.out.println("Student Name: " + Sname);
        System.out.println("Marks in OOP: " + OOP_marks);
        System.out.println("Marks in CALCULUS: " + Calculus_marks);
        System.out.println("Marks in SAD: " + SAD_marks);
        System.out.println("Total Marks: " + Total);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.getdata();    // Accept student data
        student1.displaydata(); // Display student data
    }
}

