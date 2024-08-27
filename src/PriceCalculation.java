public class PriceCalculation {
    /*

    3. Price Calculation:
You went to a store where apples cost 0.50 each, and oranges cost 0.75
each. Define variables applesBought and orangesBought and assign values 6 and
4 to them respectively. Now, calculate the total cost and store it in a variable called totalCost.
     */
    public static void main(String[] args) {
        double appleCost = 0.50;
        double orangeCost = 0.75;

        int applesBought = 6;
        int orangesBought = 4;

        double totalCost = (applesBought * appleCost) + (orangesBought * orangeCost);

        System.out.println("Total cost: $" + totalCost);
    }
}
