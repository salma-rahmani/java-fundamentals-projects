import java.util.Scanner;

public class WeekdaysUsingIfConditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println(" Please enter the Number to print a day:");
        number = input.nextInt();


        if (number == 1) { System.out.println("Saturday");}
        else if (number == 2) { System.out.println("Sunday");}
        else if (number == 3) { System.out.println("Monday");}
        else if (number == 4) { System.out.println("Tuesday");}
        else if (number == 5) { System.out.println("Wednesday");}
        else if (number == 6) { System.out.println("Thursday");}
        else if (number == 7) { System.out.println(" Friday");}
        else { System.out.println(" Invalid Number!!");}

    }}