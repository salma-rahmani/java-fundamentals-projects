import java.util.Scanner;

public class ConditionalOperatorExampleTwo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOne, numberTwo, max;
        System.out.println(" Please enter your first number ");

        numberOne = input.nextInt();
        System.out.println(" Please enter your second number ");

        numberTwo = input.nextInt();

        max = (numberOne < numberTwo) ? numberOne : numberOne;
        System.out.println(" The greater number is: " + max);
        System.out.println(" The greater number is :" + ((numberOne < numberTwo) ? numberTwo : numberOne));


    }
}
