public class ConditionalOperatorExample {

    public static void main(String[] args) {
        String color1 = "Red";
        String color2 = "Blue";


        String favoriteColor = (color1.equals("Red")) ? color1 : color2;

        System.out.println("Your favorite color is: " + favoriteColor);
    }
}

