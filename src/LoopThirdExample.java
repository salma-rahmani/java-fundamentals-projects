import java.util.Arrays;

/*
Find the largest number in an array: Create a loop that iterates through an array and finds the largest number.
 */
public class LoopThirdExample {
    public static void main(String[] args) {
        int[] numbers = {10, 2, 100, 500, 1235, 35, 66, 88, 98};
        int largest = numbers[0];
        int i = 0;
        for (i = 0; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                largest = numbers[i];

//            Arrays.sort(numbers);
//            if (i == numbers.length - 1) {
//                System.out.println(" this is the largest number " + numbers[numbers.length-1]);
            }
        }
        System.out.println(" this is the largest number is: " + largest);

    }
}
