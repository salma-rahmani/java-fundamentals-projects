import java.util.ArrayList;
import java.util.Random;

public class RandomWithLoopAndArrayList {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arraylist = new ArrayList<>();

        int randomNumber = 0;
        for (int i = 1; i <= 20; i++) {
            randomNumber = random.nextInt((1000) + 1);
            arraylist.add(randomNumber);
        }
        System.out.println(arraylist);

    }
}
