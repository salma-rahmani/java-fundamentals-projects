import java.util.Scanner;

public class ConditionalOperatorExampleTwo {

    public static void main(String[] args) {
        // Create a Scanner object to capture user input
        Scanner input = new Scanner(System.in);

        // Declare variables to store the two numbers and the maximum value
        int numberOne, numberTwo, max;

        // Prompt the user to enter the first number
        System.out.println("Please enter your first number:");
        numberOne = input.nextInt();  // Capture the first number input by the user

        // Prompt the user to enter the second number
        System.out.println("Please enter your second number:");
        numberTwo = input.nextInt();  // Capture the second number input by the user

        // Determine the maximum of the two numbers using a conditional (ternary) operator
        // However, there seems to be a mistake here; it should compare numberOne and numberTwo
        max = (numberOne > numberTwo) ? numberOne : numberTwo;

        // Display the greater number (using the corrected max value)
        System.out.println("The greater number is: " + max);

        // Alternatively, use the conditional operator directly in the print statement
        System.out.println("The greater number is: " + ((numberOne > numberTwo) ? numberOne : numberTwo));
    }
}
