import java.util.Random;

public class RandomNumbersPrinting {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];

        // Populate the array with random numbers between 0 and 9
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);  // Generating random numbers between 0 and 9
        }

        // Pick a random index and print the value at that index
        int randomIndex = random.nextInt(numbers.length);  // Random index between 0 and 9
        System.out.println("Random number at index " + randomIndex + ": " + numbers[randomIndex]);

        // Print the entire array for reference
        System.out.println("All random numbers: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
