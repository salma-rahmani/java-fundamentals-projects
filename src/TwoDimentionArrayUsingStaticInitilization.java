import java.util.Arrays;

public class TwoDimentionArrayUsingStaticInitilization {
    public static void main(String[] args) {
        int[][] numbers = {
                {2, 4, 6},
                {77, 88, 23},
                {67, 22, 101}
        };

        System.out.println(numbers[1][2]);
        System.out.println(numbers[0][1]);
        System.out.println(numbers[2][2]);
        System.out.println(Arrays.deepToString(numbers));
    }
}
