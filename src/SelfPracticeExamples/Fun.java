package SelfPracticeExamples;


/*
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 */
public class Fun {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { // Loop for each row
            for (int j = 0; j < 5; j++) { // Loop for each column
                System.out.print("* "); // Print star
            }
            System.out.println();
        }



        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         *
         */
        for (int i = 0; i <= 5; i++) { // Loop for each row
            for (int j = 0; j < i; j++) { // Loop for each column
                System.out.print("* "); // Print star
            }
            System.out.println();
        }


    }
}
