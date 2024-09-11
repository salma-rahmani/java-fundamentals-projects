public class StaticArrayExample {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 77, 88, 23, 67};

        numbers[4] = 22;
        numbers[6] = 101;
        System.out.println(numbers.length);

        System.out.println(numbers[2] + " " + numbers[5] + " "+ numbers[6]);
        numbers[7]= 130;

    }
}
