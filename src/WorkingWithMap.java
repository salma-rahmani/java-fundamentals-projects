import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class WorkingWithMap {
    public static void main(String[] args) {
        Map<Integer, String> colleagues = new LinkedHashMap<>();
        Map<Character, String> classes = new TreeMap<>();


        colleagues.put(6, "Alex");
        colleagues.put(2, "Tony");
        colleagues.put(7, "Zayn");
        colleagues.put(4, "Hamed");

        System.out.println(colleagues);


        classes.put('Z', "Math");
        classes.put('A', "Coding");
        classes.put('I', "French");
        classes.put('D', "History");

        System.out.println(classes);

    }
}
