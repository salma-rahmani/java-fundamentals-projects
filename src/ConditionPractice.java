package test;

import java.util.Scanner;

public class ConditionPractice {

    public static void main(String[] args) {

        // Uncomment and use this block to classify age into different groups
        /*
         * Age Group Classification
         *
         * Objective: Classify individuals into age groups based on their age.
         *
         * You're designing a system that categorizes individuals into age groups:
         *  - Child (0-12)
         *  - Teenager (13-19)
         *  - Adult (20 and above)
         *
         * A user provides their age: int userAge = 15; (This value can be changed for testing).
         * Determine the user's age group.
         * Print out the age group of the user.
         */
        /*
        Scanner input = new Scanner(System.in);  // Create a Scanner object to capture user input
        int age;  // Variable to store the user's age
        System.out.print("Please enter your age: ");  // Prompt user to enter their age
        age = input.nextInt();  // Read the user's input

        // Determine the age group based on the input
        if (age >= 0 && age <= 12) {
            System.out.println("Child");  // Output for children
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager");  // Output for teenagers
        } else if (age >= 20) {
            System.out.println("Adult");  // Output for adults
        } else {
            System.out.println("Invalid age input.");  // Output for invalid age
        }
        */

        // Secret Code Verification
        int secretCode = 1234;  // Define the correct secret code
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to capture user input

        System.out.print("Please enter the secret code: ");  // Prompt user to enter the secret code
        int enteredCode = scanner.nextInt();  // Read the user's input for the secret code

        // Check if the entered code matches the secret code
        if (enteredCode == secretCode) {
            System.out.println("Access granted!");  // Access granted if codes match
        } else {
            System.out.println("Access denied!");  // Access denied if codes do not match
        }

        // Check if the entered code is definitely not the secret code
        if (enteredCode != secretCode) {
            System.out.println("The entered code is definitely not the secret code.");  // Additional message if codes do not match
        }
    }
}
