
/*
   Temperature Logger:

   Objective: Store daily average temperatures for a week and retrieve a specific day's temperature.

   Steps:

   Declare a 1D array of size 7. This will represent temperatures for seven days.
   Assign a temperature value to each day.
   To find the temperature on the 4th day, access the element at index 3 (since array indices start from 0).
   Print the temperature value retrieved from the array.

   NOTE: You need to use scanner to enter the temperature for each day and store them into 1D Array.


 */
import java.util.Scanner;

public class TemperatureLogger {
    public static void main(String[] args) {
        double[] temperatures = new double[7];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Temperature for day 1:");
        temperatures[0] = scanner.nextDouble();

        System.out.print("Temperature for day 2:");
        temperatures[1] = scanner.nextDouble();

        System.out.print("Temperature for day 3:");
        temperatures[2] = scanner.nextDouble();

        System.out.print("Temperature for day 4:");
        temperatures[3] = scanner.nextDouble();

        System.out.print("Temperature for day 5:");
        temperatures[4] = scanner.nextDouble();

        System.out.print("Temperature for day 6:");
        temperatures[5] = scanner.nextDouble();

        System.out.print("Temperature for day 7:");
        temperatures[6] = scanner.nextDouble();

        double DayFourthTemperature = temperatures[3];

        System.out.println("Temperature for day 4 is: " + DayFourthTemperature);

    }
}

