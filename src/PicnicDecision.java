public class PicnicDecision {
    public static void main(String[] args) {

        // Define weather conditions for deciding on a picnic
        boolean isSunny = true;  // Indicates if the weather is sunny
        boolean isPleasantTemperature = false;  // Indicates if the temperature is pleasant

        // Check if both weather conditions are favorable for a picnic
        if (isSunny && isPleasantTemperature) {
            System.out.println("Perfect day for a picnic! Go ahead and enjoy.");
        }
        // Check if at least one of the conditions is favorable
        else if (isSunny || isPleasantTemperature) {
            System.out.println("The weather is not perfect, but you can still go for a picnic.");
        }
        // Check if the weather is not sunny
        else if (!isSunny) {
            System.out.println("The weather is not sunny. It might be better to postpone the picnic.");
        }
        // Default case: when none of the conditions are met
        else {
            System.out.println("The weather is neither sunny nor pleasant. It's best to postpone the picnic.");
        }
    }
}
