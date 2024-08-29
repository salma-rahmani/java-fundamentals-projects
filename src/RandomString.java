import java.util.Random;

public class RandomString {

    public static void main(String[] args) {

        // Create an instance of Random to generate random numbers
        Random random = new Random();

        // Variable to store the randomly generated index
        int randomIndex;

        // String from which characters will be randomly selected
        String str = "Hello World";

        // Calculate the maximum index for the random number generation
        // Minimum index is 0, and maximum index is length of the string - 1
        // str.length() - 1 gives the last valid index of the string
        // random.nextInt((str.length() - 1 - 0) + 0) generates a random index within the range [0, str.length() - 1]
        randomIndex = random.nextInt(str.length());

        // Print a random character from the original string
        System.out.println("Random Character: " + str.charAt(randomIndex));

        // Print a random character from the string with spaces removed
        // str.replace(" ", "") removes all spaces from the string
        // The randomIndex is used to select a character from the modified string
        System.out.println("Random Character: " + str.replace(" ", "").charAt(randomIndex));
    }
}
