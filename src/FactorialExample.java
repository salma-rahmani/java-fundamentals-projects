import java.util.Scanner;

/*
Factorial of a number: Write a loop to calculate the factorial of a number n. n!=n×(n−1)×(n−2)×…×1
 */
public class FactorialExample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number to find its factorial: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
