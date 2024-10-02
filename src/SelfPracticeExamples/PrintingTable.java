package SelfPracticeExamples;
/*
  /*
   *
   *    ---------| Name | --------- | LastName | --------- | country ---------
   *    ---------| Bob  | --------- | Morphy | --------- | United States ---------
   *
   *
   * */

import java.awt.desktop.ScreenSleepEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrintingTable {
    public static void main(String[] args) {

        String[][] userInfo = new String[3][3];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("user " + (i + 1) + ":");
            System.out.print("Please enter your first name: ");
            userInfo[i][0] = input.next();

            System.out.print("Please enter last name: ");
            userInfo[i][1] = input.next();

            System.out.print("Please enter country: ");
            userInfo[i][2] = input.next();


        }
//        System.out.println(Arrays.deepToString(userInfo));
        System.out.printf("%-12s | %-10s | %-12s | %-10s | %-12s | %-10s%,",
                "----------", "Name", "----------", "LastName", "----------", "Country"
        );

        for (int i = 0; i < userInfo.length; i++) {
            System.out.printf("%-12s | %-10s | %-12s | %-10s | %-12s | %-10s%n",
                    "----------", userInfo[i][0], "----------", userInfo[i][1], "----------", userInfo[i][2]
            );
        }

    }
}
