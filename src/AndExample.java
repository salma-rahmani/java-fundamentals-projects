public class AndExample {

    public static void main(String[] args) {
        // Declare and initialize four integer variables
        int numberOne = 10;   // First number
        int numberTwo = 20;   // Second number
        int numberThree = 25; // Third number
        int numberFour = 25;  // Fourth number

        // Calculate the sum of the first two numbers
        int resultOne = numberOne + numberTwo;  // Result of adding numberOne and numberTwo

        // Calculate the sum of the last two numbers
        int resultTwo = numberThree + numberFour;  // Result of adding numberThree and numberFour

        // Check if both conditions are true:
        // 1. resultOne equals resultTwo
        // 2. numberOne equals numberFour
        boolean isEqual = (resultOne == resultTwo) && (numberOne == numberFour);

        // Print the result of the comparison
        System.out.println("Is equal? " + isEqual);  // Output whether both conditions
    }}