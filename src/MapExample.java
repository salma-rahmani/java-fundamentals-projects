import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
      
        Map<String, Integer> GradesOfStudent = new HashMap<>();


        GradesOfStudent.put("Bob", 85);
        GradesOfStudent.put("Bob2", 90);
        GradesOfStudent.put("Bob3", 78);

        System.out.println(GradesOfStudent);
        GradesOfStudent.remove("Bob");
        System.out.println(GradesOfStudent);
        GradesOfStudent.put("", 100);
        System.out.println(GradesOfStudent);

    }
}



