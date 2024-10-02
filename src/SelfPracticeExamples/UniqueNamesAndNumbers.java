package SelfPracticeExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UniqueNamesAndNumbers {
    public static void main(String[] args) {

        // want to print the unique names and numbers
        String[] names = {"Bob", "Murphy", "Tony", "John", "Tony", "Bob", "Leyla", "Jame"};
        int[] numbers = {2, 5, 7, 10, 100, 4, 4, 100, 34, 26, 66, 5, 1, 78, 32, 34};

        // using array list, or also we can use Hashset to not have duplicate values
        List<String> listOfNames = new ArrayList<>();
        List<Integer> listOfNumbers = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            if (listOfNames.contains(names[i])) {

            } else listOfNames.add(names[i]);
        }
        System.out.println(listOfNames);

        for (int i = 0; i < numbers.length; i++) {
            if (listOfNumbers.contains(numbers[i])) {

            } else listOfNumbers.add(numbers[i]);
        }
        Collections.sort(listOfNumbers);
        System.out.println(listOfNumbers);
    }
}
