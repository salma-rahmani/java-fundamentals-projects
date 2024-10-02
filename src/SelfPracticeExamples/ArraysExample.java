package SelfPracticeExamples;
/*
sum first and last number of array
 */

public class ArraysExample {
    public static void main(String[] args) {
        int sum = 0;


        int[] numbers = {20, 40, 10, 35};
        for (int number : numbers) {
            System.out.print(number);}
            sum = numbers[0] + numbers[numbers.length - 1];



        System.out.println();
        System.out.println(sum);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }

    }

}
