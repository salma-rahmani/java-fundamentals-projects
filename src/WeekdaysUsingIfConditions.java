import java.util.Scanner;

public class WeekdaysUsingIfConditions {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Variable to store the user's input number
        int dayNumber;

        // Prompt the user to enter a number to get the corresponding day of the week
        System.out.println("Please enter the number (1-7) to print a day:");

        // Read the input number from the user
        dayNumber = input.nextInt();

        // Determine and print the day of the week based on the input number
        if (dayNumber == 1) {
            // If the number is 1, print "Saturday"
            System.out.println("Saturday");
        } else if (dayNumber == 2) {
            // If the number is 2, print "Sunday"
            System.out.println("Sunday");
        } else if (dayNumber == 3) {
            // If the number is 3, print "Monday"
            System.out.println("Monday");
        } else if (dayNumber == 4) {
            // If the number is 4, print "Tuesday"
            System.out.println("Tuesday");
        } else if (dayNumber == 5) {
            // If the number is 5, print "Wednesday"
            System.out.println("Wednesday");
        } else if (dayNumber == 6) {
            // If the number is 6, print "Thursday"
            System.out.println("Thursday");
        } else if (dayNumber == 7) {
            // If the number is 7, print "Friday"
            System.out.println("Friday");
        } else {
            // If the number is not between 1 and 7, print "Invalid Number!!"
            System.out.println("Invalid Number!!");
        }

        // Close the Scanner object
        input.close();
    }
}
