public class VariablePractice {

    /*
    Variables:

    1. Creating Variables:
    Suppose you are tasked to make a simple grocery list application. Start by defining the following variables:
    - breadCount which stores the number of bread loaves you want to buy.
    - milkLiters which represents how many liters of milk you need.
    - isEggsRequired which should tell if you need eggs or not (true or false).
    - storeName which holds the name of the store where you're planning to shop.

    2. Assigning Values:
    You've just realized you need 3 loaves of bread, 2 liters of milk, you do require eggs, and you're shopping at "Martland". Assign these values to the variables you've just created.

    3. Updating Variables:
    Oops! You've just noticed you have enough milk at home. Update the milkLiters to 0 and change storeName to "BreadBasket" since they specialize in bakery items.

    4. Displaying Variables:
    Write a program that, when executed, will display a message: "Shopping at [storeName]. Need to buy [breadCount] loaves of bread, [milkLiters] liters of milk. Eggs required: [isEggsRequired]".

    5. Variable Swapping:
    You have two variables a = 5 and b = 10. Without using any other variables, swap the values of a and b so that a has value 10 and b has value 5.
    */

    public static void main(String[] args) {
        // Define variables for the grocery list
        int breadCount = 3;              // Number of loaves of bread
        double milkLiters = 2.0;         // Liters of milk needed
        boolean isEggsRequired = true;  // Whether eggs are needed
        String storeName = "Martland";  // Name of the store

        // Update the variables based on new information
        milkLiters = 0.0;                // No milk needed now
        storeName = "BreadBasket";      // Change store name to BreadBasket

        // Display the updated grocery list
        System.out.println("Shopping from " + storeName + " to buy " + breadCount + " loaves of bread, " + milkLiters + " liters of milk. Eggs required: " + isEggsRequired);

        // Swapping the values of variables a and b without using a temporary variable
        int a = 5;                       // Initial value of a
        int b = 10;                      // Initial value of b

        a = a * b;                      // a becomes 50 (5 * 10)
        b = a / b;                      // b becomes 5 (50 / 10)
        a = a / b;                      // a becomes 10 (50 / 5)

        // Display the swapped values
        System.out.println(a);          // Output: 10
        System.out.println(b);          // Output: 5
    }
}
