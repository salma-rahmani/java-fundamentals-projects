package SelfPracticeExamples;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        int[] randomNumbers = new int[10];

        Random random = new Random();
        int randomNumber;

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumber = random.nextInt(10 - 1) + 1;
            randomNumbers[i] = randomNumber;
            System.out.print((i == randomNumbers.length - 1) ? randomNumbers[i] : randomNumbers[i] + ", ");


        }

    }
}
