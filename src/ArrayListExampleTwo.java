import java.util.ArrayList;
import java.util.List;

public class ArrayListExampleTwo {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        List<Integer> scores = new ArrayList<>();

        names.add("John");
        names.add("Jim");
        names.add("Josh");
        names.add("Antonio");
        names.add("Montana");

        System.out.println(names);

        names.remove("John");

        for (String name : names) {
            System.out.println(name);
        }

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i)); }}}