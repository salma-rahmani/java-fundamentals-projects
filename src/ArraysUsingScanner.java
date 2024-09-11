import java.util.Arrays;
import java.util.Scanner;

public class ArraysUsingScanner {
    public static void main(String[] args) {

        String name;
        String lastName;
        String dob;


        String[] details = new String[3];
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first name:");

        details[0] = input.next();

        System.out.print("Please enter your last name:");

        details[1] = input.next();

        System.out.print("Please enter your DOB:");

        details[2] = input.next();

        System.out.println(Arrays.toString(details));


    }
}
