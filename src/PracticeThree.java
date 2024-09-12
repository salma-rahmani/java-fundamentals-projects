import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;

public class PracticeThree {
    public static void main(String[] args) {
        List<String> listOfNames = new ArrayList<>();
        Random random = new Random();
        int randomIndex = 0;
        listOfNames.add("Bob");
        listOfNames.add("Samita");
        listOfNames.add("Meryam");
        listOfNames.add("Ahmad");
        listOfNames.add("Zayn");
        listOfNames.add("Selina");
        System.out.println(listOfNames);
        randomIndex = random.nextInt(listOfNames.size() - 1) + 0;

        System.out.println(randomIndex);
        System.out.println(randomIndex + " belongs to this person: " + listOfNames.get(randomIndex));
// or we can do this below code
        System.out.println(listOfNames.get(random.nextInt(listOfNames.size() - 1) + 0));
    }
}
