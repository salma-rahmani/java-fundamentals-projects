public class VariablePractice {

    /*Variables:

            1. Creating Variables:
    Suppose you are tasked to make a simple grocery list application. Start by defining the following variables:

    breadCount which stores the number of bread loaves you want to buy.
    milkLiters which represents how many liters of milk you need.
    isEggsRequired which should tell if you need eggs or not (true or false).
    storeName which holds the name of the store where you're planning to shop.

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
        int breadCount = 3;
        double milkLiters = 2.0;


        boolean isEggsRequired = true;
        String storeName = "Martland";

        milkLiters = 0.0;
        storeName = "BreadBasket";

        System.out.println("Shopping from " + storeName + " to buy " + breadCount + " loaves of bread, " + milkLiters + " liters of milk. Eggs required: " + isEggsRequired);


        int a = 5;
        int b = 10;

        a = a * b; // a = 50
        b = a / b; // b = 5
        a = a / b; // a = 10

        System.out.println(a);
        System.out.println(b);

    }
}
   /*

    public class SwapVariables {

        public static void main(String[] args) {
            int a = 5;
            int b = 10;

            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("a: " + a);
            System.out.println("b: " + b);
        }
    }
}
*/

