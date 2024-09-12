import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PracticeTwo {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> listOfNumber = new ArrayList<>();
        int randomNumber = 0;

        for (int i = 1; i <= 15; i++) {
            randomNumber = random.nextInt(10) + 1;

            listOfNumber.add(randomNumber);


        }
        System.out.println(listOfNumber);

    }
}
