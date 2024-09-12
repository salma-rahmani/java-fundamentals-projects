import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PracticeOne {
    public static void main(String[] args) {
        //String[] names = new String[3];
        var input = new Scanner(System.in);
        List<String> listOfNames = new ArrayList();


        for (int i = 1; i <= 5; i++) {
            System.out.print("Please enter your first name: ");
            listOfNames.add(input.next());

        }
        System.out.println(listOfNames);


//        for (int i = 0; i < names.length; i++) {
//            System.out.print("Please enter name number " + (i + 1 )+ " : ");
//            names[i] = input.next();
//        }
//        System.out.println(Arrays.toString(names));
    }

}
