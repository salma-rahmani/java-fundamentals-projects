import java.util.Random;

public class WorkingWithLoopsAndRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[20];
        int randomNumber;
        for (int index = 0; index < numbers.length; index++) {
            randomNumber = random.nextInt((15 - 10) + 1) + 10;
            numbers[index] = randomNumber;


            System.out.print(numbers[index] + " ");
        }
    }
}
