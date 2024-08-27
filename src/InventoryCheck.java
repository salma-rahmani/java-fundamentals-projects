public class InventoryCheck {

    /*
    5. Inventory Check:
You're coding for a small bookshop. You have three variables:
fictionBooks = 20, nonFictionBooks = 10, and comicBooks = 5.
Write a program that displays the message: "We have [totalBooks] books in stock!"
by calculating the sum of all book types.
     */

    public static void main(String[] args) {


        int fictionBooks = 20;
        int nonFictionBooks = 10;
        int comicBooks = 5;
        int totalBooks = fictionBooks + nonFictionBooks + comicBooks;


        System.out.println(" We have " + totalBooks + " books in stock!");
    }
}
