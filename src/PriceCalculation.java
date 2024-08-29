public class PriceCalculation {
    /*

    3. Price Calculation:
    You went to a store where apples cost 0.50 each, and oranges cost 0.75
    each. Define variables applesBought and orangesBought and assign values 6 and
    4 to them respectively. Now, calculate the total cost and store it in a variable called totalCost.
    */
    public static void main(String[] args) {
        // Cost per unit of each fruit
        double appleCost = 0.50;  // Cost of one apple
        double orangeCost = 0.75;  // Cost of one orange

        // Number of each type of fruit bought
        int applesBought = 6;  // Number of apples bought
        int orangesBought = 4;  // Number of oranges bought

        // Calculate the total cost
        double totalCost = (applesBought * appleCost) + (orangesBought * orangeCost);  // Total cost calculation

        // Print the total cost to the console
        System.out.println("Total cost: $" + totalCost);  // Output the total cost
    }
}
