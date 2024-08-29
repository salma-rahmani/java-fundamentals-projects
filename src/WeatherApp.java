
import java.util.Scanner;

public class WeatherApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temperature;

        System.out.print("Please enter the current temperature: ");
        temperature = input.nextInt();

        if (temperature < 10) {
            System.out.println("Wear a heavy coat.");
        } else if (temperature >= 10 && temperature <= 20) {
            System.out.println("A light jacket will do.");
        } else {
            System.out.println("If it is warm, a T-shirt is fine.");
        }
    }
}

