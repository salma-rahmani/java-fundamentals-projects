import java.util.Arrays;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        double[] prices = new double[10];
        Scanner input = new Scanner(System.in);

        double totalCost = 0;

        System.out.print("Item Number 1:");
        prices[0] = input.nextDouble();
        totalCost += prices[0];

        System.out.print("Item Number 2:");
        prices[1] = input.nextDouble();
        totalCost += prices[1];

        System.out.print("Item Number 3:");
        prices[2] = input.nextDouble();
        totalCost += prices[2];

        System.out.print("Item Number 4:");
        prices[3] = input.nextDouble();
        totalCost += prices[3];

        System.out.print("Item Number 5:");
        prices[4] = input.nextDouble();
        totalCost += prices[4];

        System.out.print("Item Number 6:");
        prices[5] = input.nextDouble();
        totalCost += prices[5];

        System.out.print("Item Number 7:");
        prices[6] = input.nextDouble();
        totalCost += prices[6];

        System.out.print("Item Number 8:");
        prices[7] = input.nextDouble();
        totalCost += prices[7];

        System.out.print("Item Number 9:");
        prices[8] = input.nextDouble();
        totalCost += prices[8];

        System.out.print("Item Number 10:");
        prices[9] = input.nextDouble();
        totalCost += prices[9];


        System.out.println(" The total cost of all items is: " + totalCost);

        Arrays.sort(prices);
        System.out.println(" The lowest price is: " + prices[0]);
        System.out.println(" The highest price is: " + prices[9]);


    }
}