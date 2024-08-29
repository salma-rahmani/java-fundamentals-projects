package test;

import java.util.Scanner;

public class ConditionPractice {

    public static void main(String[] args) {



     /*   if (score < 0 || score > 100) {
            System.out.println("Score is out of range. Please enter a score between 0 and 100.");
        } else if (score >= 90) {
            System.out.println("Your grade is: A");
        } else if (score >= 80) {
            System.out.println("Your grade is: B");
        } else if (score >= 70) {
            System.out.println("Your grade is: C");
        } else {
            System.out.println("Your grade is: F");*/

         /*
* Age Group Classification

Objective: Classify individuals into age groups based on their age.

You're designing a system that categorizes individuals into age groups:
*  Child (0-12),
* Teenager (13-19),
* and Adult (20 and above).
A user provides their age: int userAge = 15; (This value can be changed for testing).
Determine the user's age group.
Print out the age group of the user.
* */
//        Scanner input = new Scanner(System.in);
//        int age;
//        System.out.print("Please enter your age: ");
//        age = input.nextInt();
//
//        if (age >= 0 && age <= 12) {
//            System.out.println("Child");
//        } else if (age >= 13 && age <= 19) {
//            System.out.println("Teenager");
//        } else if (age >= 20) {
//            System.out.println("Adult");
//        } else {
//            System.out.println("Invalid age input.");
//        }


        int secretCode = 1234;
        Scanner scanner = new Scanner(System.in);


        System.out.print("Please enter the secret code: ");
        int enteredCode = scanner.nextInt();


        if (enteredCode == secretCode) {
            System.out.println("Access granted!");
        } else {
            System.out.println("Access denied!");
        }

        if (enteredCode != secretCode) {
            System.out.println("The entered code is definitely not the secret code.");
        }
    }

}


// create a new project, give a meaning name, create at least one package inside and at least one java class containing a main method then
// create a new repo and push your new project to that report. and then send the links to me in the chat.