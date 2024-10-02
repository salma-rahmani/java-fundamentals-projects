package SelfPracticeExamples;

public class DifferentTypesOfMethods {
    public static void main(String[] args) {
        multiply(30, 100);
        printMessage();
        int result = sum (255, 40);
        System.out.println(result);
        int sum = divide() / 5;
        System.out.println(sum);


    }

    // Methods with parameters and without return (multiply).
    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }
    // Methods without parameters and without return (printMessage).

    public static void printMessage() {
        System.out.println("Hello Students!");
    }

    // Methods with parameters and with a return (sum).
    public static int sum(int a, int b) {
        return a + b;
    }

    // Methods without parameters but with a return (divide).
    public static int divide() {
        return 35;
    }

}
