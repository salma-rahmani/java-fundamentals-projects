import java.util.Scanner;

public class WorkingWithForLoop {
    public static void main(String[] args) {
//         // Ask the user for their name and then ask them how many times they would like to print it into the console
        Scanner input = new Scanner(System.in);
        String userName;
        int count;
        System.out.print("What is your name ? ");
        userName= input.next()
;
        System.out.print("How many time do you want to print your name?");
        count = input.nextInt();
        for (int i = 1; i<= count; i++){
            System.out.println("My name is:" + userName);
        }

    }
}
