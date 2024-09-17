import jdk.jshell.Snippet;

import javax.swing.*;

public class WorkingWithArraysAndLoops {
    public static void main(String[] args) {
        int[] numbers = {20, 40, 50, 100, 133, 145, 34};

        for (int i = 0; i < numbers.length; i++)
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + ",");

            }
        System.out.println();
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *  ");
        for (int i = 0; i < numbers.length; i++)
            System.out.print((i == numbers.length - 1) ? numbers[i] + "" : numbers[i] + ",");


    }
}
