import java.util.Scanner;

public class CarExampleScanner {

    public static void main(String[] args) {
        Scanner carDetails = new Scanner(System.in);
        String make;
        int year;
        String color;
        String engineType;

        System.out.println(" Please enter the car make: ");
        make = carDetails.next();

        System.out.println(" Please enter the car year:");
        year = carDetails.nextInt();

        System.out.println(" Please enter the car color: ");
        color = carDetails.next();

        System.out.println(" Please enter the car engine Type: ");
        engineType = carDetails.next();

        System.out.print(" Car make" + make + "\n" + " Car year" + year + "\n" + " Car color" + color + "\n" + "Car engin Type" + engineType);
    }
}
