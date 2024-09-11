
import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] userEntry = new String[5][3];
        int i = 0;

        do {
            System.out.print("First Name: ");
            userEntry[i][0] = scanner.nextLine();

            System.out.print("Last Name: ");
            userEntry[i][1] = scanner.nextLine();

            System.out.print("Country: ");
            userEntry[i][2] = scanner.nextLine();
            i++;


        } while (i < 5);

        System.out.println("The entries are: ");
        for (int j = 0; j < 5; j++) {
            System.out.println("Entry " + (j + 1) + ": " +
                    "FirstName: " + userEntry[j][0] + ", " +
                    "LastName: " + userEntry[j][1] + ", " +
                    "Country: " + userEntry[j][2]);
        }

    }
}


