package SelfPracticeExamples;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> listOfNames = new ArrayList<>();
        listOfNames.add("Bob");
        listOfNames.add("Tony");
        listOfNames.add("Trever");
        listOfNames.add("Ahmad");
        listOfNames.add("Naz");
        listOfNames.add("Leyla");
        listOfNames.add("Bob");
        listOfNames.add("Bob");
        System.out.println(listOfNames);


        for (int i = listOfNames.size() - 1; i >= 0; i--) {
            if (listOfNames.get(i).equals("Bob")) {
                listOfNames.remove(i);
            }
        }
        System.out.println(listOfNames);


    }
}
