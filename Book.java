/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam.isbn;

/**
 *
 * @author USER
 */
public class Book {
    private String title;
    private String author;
    private String publisher;
    private String city;
    private String pubDate;
    private double price;
    private ISBN isbnNum; // Reference to ISBN class

    // Constructor
    public Book(String title, String author, String publisher, String city, String pubDate, double price, ISBN isbnNum) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.city = city;
        this.pubDate = pubDate;
        this.price = price;
        this.isbnNum = isbnNum;
    }

    // Method to set the ISBN of the book
    public void setBookISBN(ISBN isbnNum) {
        this.isbnNum = isbnNum;
    }

    // Method to get the author of the book
    public String getAuthor() {
        return this.author;
    }

    // Method to get the ISBN of the book
    public String getBookISBN() {
        return this.isbnNum.getISBN();
    }

    // Method to print the book's details
    public void printDetails() {
        System.out.println("Book Title: " + this.title);
        System.out.println("Book Author: " + this.author);
        System.out.println("Publisher: " + this.publisher);
        System.out.println("City of Publication: " + this.city);
        System.out.println("Publication Date: " + this.pubDate);
        System.out.println("Price: $" + String.format("%.2f", this.price));
        System.out.println("ISBN: " + this.getBookISBN());
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        try {
            // Create an ISBN object
            ISBN isbnNum = new ISBN("0 941831 39 6");

            // Create a Book object
            Book book = new Book(
                "Object-oriented Programming with Java",
                "David J. Barnes and Michael Kolling",
                "Prentice Hall",
                "New York",
                "2023-01-01",
                49.99,
                isbnNum
            );

            // Print the book's details
            book.printDetails();

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

