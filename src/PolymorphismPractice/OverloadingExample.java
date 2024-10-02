package PolymorphismPractice;

public class OverloadingExample {
    public static void main(String[] args) {

        int result1 = multiply(5, 10);
        System.out.println("Multiplication of 2 numbers: " + result1);


        int result2 = multiply(5, 10, 2);
        System.out.println("Multiplication of 3 numbers: " + result2);
    }


    public static int multiply(int a, int b) {
        return a * b;
    }


    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
}
