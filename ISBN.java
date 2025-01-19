/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exam.isbn;

/**
 *
 * @author USER
 */
public class ISBN {
    private String isbn;

    // Constructor
    public ISBN(String isbn) {
        if (isValidISBN(isbn)) {
            this.isbn = isbn;
        } else {
            throw new IllegalArgumentException("Invalid ISBN format. Please ensure the format is correct.");
        }
    }

    // Method to set ISBN
    public void setISBN(String isbn) {
        if (isValidISBN(isbn)) {
            this.isbn = isbn;
        } else {
            throw new IllegalArgumentException("Invalid ISBN format. Please ensure the format is correct.");
        }
    }

    // Method to get ISBN
    public String getISBN() {
        return this.isbn;
    }

    // Method to validate ISBN format
    private boolean isValidISBN(String isbn) {
        String[] parts = isbn.split(" ");
        if (parts.length != 4) {
            System.out.println("Error: ISBN must have 4 parts separated by spaces.");
            return false;
        }

        // Validate part lengths
        int[] expectedLengths = {1, 6, 2, 1};
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].length() != expectedLengths[i]) {
                System.out.printf("Error: Part %d of the ISBN must have %d digits.%n", i + 1, expectedLengths[i]);
                return false;
            }
            if (!parts[i].matches("\\d+")) {
                System.out.printf("Error: Part %d of the ISBN contains invalid characters.%n", i + 1);
                return false;
            }
        }

        // Validate check digit
        if (!isValidCheckDigit(parts)) {
            System.out.println("Error: The check digit is invalid.");
            return false;
        }

        return true;
    }

    // Method to validate check digit
    private boolean isValidCheckDigit(String[] parts) {
        String combined = String.join("", parts[0], parts[1], parts[2]);
        int checkDigit = Integer.parseInt(parts[3]);
        int sum = 0;

        for (char c : combined.toCharArray()) {
            sum += Character.getNumericValue(c);
        }

        return sum % 10 == checkDigit;
    }

    // Main method to test the ISBN class
    public static void main(String[] args) {
        try {
            // Create a valid ISBN object
            ISBN isbn = new ISBN("0 941831 39 6");
            System.out.println("Valid ISBN created: " + isbn.getISBN());

            // Attempt to create an invalid ISBN
            ISBN invalidIsbn = new ISBN("0 1234 56 789");
            System.out.println("This line won't execute because the previous ISBN is invalid.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

