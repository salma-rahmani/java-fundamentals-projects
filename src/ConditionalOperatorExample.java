public class ConditionalOperatorExample {

    public static void main(String[] args) {
        // Declare and initialize the first color
        String color1 = "Red";  // This is the first color option

        // Declare and initialize the second color
        String color2 = "Blue";  // This is the second color option

        // Use a conditional (ternary) operator to determine the favorite color
        // If color1 is "Red", favoriteColor will be set to color1; otherwise, it will be set to color2
        String favoriteColor = (color1.equals("Red")) ? color1 : color2;

        // Display the selected favorite color
        System.out.println("Your favorite color is: " + favoriteColor);
    }
}
