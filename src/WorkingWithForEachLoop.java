import java.util.Arrays;

public class WorkingWithForEachLoop {
    public static void main(String[] args) {
        int[] numbers = {20, 30, 40, 10};
        int total = 0;

        for (int index = 0; index < numbers.length; index++) {
            // Arrays.sort(numbers);
            System.out.print(numbers[index] + " ");

         /*   total += numbers[index];
        }
        System.out.println();
        System.out.println(total);
}
          */
        }

        // Using For each
        System.out.println();
        for (int num : numbers) {
            System.out.print(num + " ");

            total += num;

        }
        System.out.println();
        System.out.println(total);
    }
}

