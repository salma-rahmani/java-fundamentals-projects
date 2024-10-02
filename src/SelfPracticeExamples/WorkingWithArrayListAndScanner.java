package SelfPracticeExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WorkingWithArrayListAndScanner {
    public static void main(String[] args) {
        List<String> listOfNames = new ArrayList<>();
        List<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("Tony");
        names.add("Murphy");
        names.add("Leyla");
        names.add("Ahmad");
        names.add("Zayn");
        names.add("Mitra");
        names.add("Jahn");


        Scanner input = new Scanner(System.in);
        Random random = new Random();
        List<Integer> randomNumbers = new ArrayList<>();

        int randomNumber = 0;

        for (int index = 0; index <= 15; index++) {
            randomNumber = random.nextInt(names.size() - 1) + 0;

        }
        System.out.println(randomNumber);
        System.out.println(names.get(randomNumber));


        for (int i = 0; i <= 5; i++) {
            System.out.print("User number " + (i + 1) + " is: ");
            listOfNames.add(input.next());

        }
        System.out.println(listOfNames);

        for (int index = 0; index <= 15; index++) {
            randomNumber = random.nextInt(100) + 1;
            randomNumbers.add(randomNumber);


        }
        System.out.println(randomNumbers);


    }
}
