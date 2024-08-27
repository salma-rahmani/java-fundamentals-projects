import java.util.Random;

public class RandomString {

    public static void main(String[] args) {

        Random random = new Random();
        int randomIndex;
        String str = "Hello World";

        // (Max - min) + min
        // min --> 0
        // max --> n - 1 --> length() - 1

        // Generate random indexes at each run
        randomIndex = random.nextInt((str.length() - 1 - 0) + 0);

        System.out.println("Random Character: " + str.charAt(randomIndex));
        System.out.println("Random Character: " + str.replace(" ", "").charAt(randomIndex));


    }
}
