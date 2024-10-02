public class EvenOddNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12};

        // Print odd numbers
//        System.out.print("Odd numbers: ");
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 != 0) {
//                System.out.print(numbers[i]);
//                if (i < numbers.length - 1) {
//                    System.out.print(", ");
//                }
//            }
//        }

        System.out.println(); // For a new line

        // Print even numbers
        System.out.print("Even numbers: ");
        for (int number: numbers) {
            if (number % 2 == 0) {
                System.out.print(number);
                if (number < numbers.length - 1) {
                    System.out.print(", ");
                }
            }
        }
    }
}
