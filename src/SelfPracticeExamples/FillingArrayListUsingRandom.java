package SelfPracticeExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FillingArrayListUsingRandom {
    public static void main(String[] args) {
        ArrayList<Integer> ListOfNumbers = new ArrayList<>();
        Random random = new Random();
        int randomNumber = 0;


        for (int i = 1; i < 16; i++) {
            randomNumber = random.nextInt(100) + 1;
            ListOfNumbers.add(randomNumber);


        }
        System.out.println(ListOfNumbers);

    }
}
