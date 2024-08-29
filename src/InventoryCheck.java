public class InventoryCheck {

    /*
    5. Inventory Check:
    You're coding for a small bookshop. You have three variables:
    fictionBooks = 20, nonFictionBooks = 10, and comicBooks = 5.
    Write a program that displays the message: "We have [totalBooks] books in stock!"
    by calculating the sum of all book types.
    */

    public static void main(String[] args) {
        // Declare and initialize the number of books in each category
        int fictionBooks = 20;  // Number of fiction books in stock
        int nonFictionBooks = 10;  // Number of non-fiction books in stock
        int comicBooks = 5;  // Number of comic books in stock

        // Calculate the total number of books by summing all categories
        int totalBooks = fictionBooks + nonFictionBooks + comicBooks;

        // Display the total number of books in stock
        System.out.println("We have " + totalBooks + " books in stock!");
    }
}
