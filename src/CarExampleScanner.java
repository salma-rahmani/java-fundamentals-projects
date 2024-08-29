import java.util.Scanner;

public class CarExampleScanner {

    public static void main(String[] args) {
        // Create a Scanner object to capture user input
        Scanner carDetails = new Scanner(System.in);

        // Declare variables to store the car's details
        String make;       // The make (brand) of the car
        int year;          // The manufacturing year of the car
        String color;      // The color of the car
        String engineType; // The type of engine the car uses

        // Prompt the user to enter the car's make
        System.out.println("Please enter the car make: ");
        make = carDetails.next();  // Capture the user's input for the car's make

        // Prompt the user to enter the car's manufacturing year
        System.out.println("Please enter the car year:");
        year = carDetails.nextInt();  // Capture the user's input for the car's year

        // Prompt the user to enter the car's color
        System.out.println("Please enter the car color: ");
        color = carDetails.next();  // Capture the user's input for the car's color

        // Prompt the user to enter the car's engine type
        System.out.println("Please enter the car engine type: ");
        engineType = carDetails.next();  // Capture the user's input for the car's engine type

        // Display the details of the car based on the user's input
        System.out.print("Car make: " + make + "\n" +
                "Car year: " + year + "\n" +
                "Car color: " + color + "\n" +
                "Car engine type: " + engineType);
    }
}
