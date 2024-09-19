package Activity;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String name = ExampleOfMethodUsingScanner.askUserName(input);
        System.out.println(name);

    }
}
