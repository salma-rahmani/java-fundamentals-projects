public class ActivityTwoIf {

    public static void main(String[] args) {
        // Declare and initialize boolean variables
        boolean isRaining = false;  // Indicates if it is raining
        boolean hasUmbrella = false;  // Indicates if the user has an umbrella
        boolean isWindy = true;  // Indicates if it is windy

        // Check if it is raining
        if (isRaining) {
            System.out.println("Stay indoors.");  // Advice to stay indoors if it is raining

            // Nested condition: Check if it is raining and the user has an umbrella
            if (isRaining && hasUmbrella) {
                System.out.println("You can go out. Must have umbrella");  // Advice to go out only if the user has an umbrella
            }
        }
        // If it is not raining, check if it is windy
        else if (isWindy) {
            System.out.println("Wear a windbreaker.");  // Advice to wear a windbreaker if it is windy
        }
        // If it is neither raining nor windy
        else {
            System.out.println("The weather is neither raining nor windy.");  // Message indicating calm weather
        }
    }
}