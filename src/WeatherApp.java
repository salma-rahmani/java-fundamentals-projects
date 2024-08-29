import java.util.Scanner;

public class WeatherApp {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner userInput = new Scanner(System.in);

        // Variable to store the current temperature
        int currentTemperature;

        // Prompt the user to enter the current temperature
        System.out.print("Please enter the current temperature: ");

        // Read the input temperature from the user
        currentTemperature = userInput.nextInt();

        // Determine the appropriate clothing recommendation based on the temperature
        if (currentTemperature < 10) {
            // If temperature is below 10 degrees, recommend a heavy coat
            System.out.println("Wear a heavy coat.");
        } else if (currentTemperature >= 10 && currentTemperature <= 20) {
            // If temperature is between 10 and 20 degrees, recommend a light jacket
            System.out.println("A light jacket will do.");
        } else {
            // If temperature is above 20 degrees, recommend a T-shirt
            System.out.println("If it is warm, a T-shirt is fine.");
        }
    }
}