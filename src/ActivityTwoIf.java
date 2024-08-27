import java.sql.SQLOutput;

public class ActivityTwoIf {

    public static void main(String[] args) {
        boolean isRaining = false;
        boolean hasUmbrella = false;
        boolean isWindy = true;
        if (isRaining) {
            System.out.println("Stay indoors.");
            if (isRaining && hasUmbrella) {
                System.out.println("You can go out. Must have umbrella");
            }
        } else if (isWindy) {
            System.out.println("Wear a windbreaker.");
        } else System.out.println(" The wather is not raining and windy");


    }

}


