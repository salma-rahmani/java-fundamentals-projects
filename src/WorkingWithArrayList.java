import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkingWithArrayList {
    public static void main(String[] args) {
        List<Integer> listOfItems = new ArrayList<>();
        Scanner input = new Scanner(System.in);


        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter Item price " + i + ": ");
            int itemPrice = input.nextInt();
            listOfItems.add(itemPrice);
        }


        System.out.println("List of items: " + listOfItems);

        int min = listOfItems.get(0);
        int max = listOfItems.get(0);
        double total = 0.0;

        for (int item : listOfItems) {
            if (item < min) {
                min = item;
            }
            if (item > max) {
                max = item;
            }
            total += item;
        }

        System.out.println("Minimum item price: " + min);
        System.out.println("Maximum item price: " + max);
        System.out.println("Total of items prices: " + total);

        double average = total / listOfItems.size();
        System.out.println("Average item price: " + average);
    }
}

