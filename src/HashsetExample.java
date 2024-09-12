import java.util.HashSet;

public class HashsetExample {
    public static void main(String[] args) {

        HashSet<String> classes = new HashSet<>();


        classes.add("Class A");
        classes.add("Class B");
        classes.add("Class C");
        classes.add("Class D");


        System.out.println("Is empty? " + classes.isEmpty());

        System.out.println("Classes: " + classes);
        System.out.println(classes.contains("Class A"));



    }

}
