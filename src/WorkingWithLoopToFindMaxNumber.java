public class WorkingWithLoopToFindMaxNumber {
    public static void main(String[] args) {
        int[] numbers = {20, 2, 1, 15};
        int max = numbers[0];
        for (int index = 1; index < numbers.length; index++)

            if (numbers[index] > max) {
                max = numbers[index];

            }

        System.out.println(max);

        int min = numbers[0];
        for (int i = 1 ; i< numbers.length; i++)
            if (numbers[i] < min){
                min = numbers[i];

            }
        System.out.println(min);
    }
}
