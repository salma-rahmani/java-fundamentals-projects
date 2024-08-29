public class PicnicDecision {
    public static void main(String[] args) {

        boolean isSunny = true;
        boolean isPleasantTemperature = false;

        if (isSunny && isPleasantTemperature) {
            System.out.println("Perfect day for a picnic! Go ahead and enjoy.");
        }
        else if (isSunny || isPleasantTemperature) {
            System.out.println("The weather is not perfect, but you can still go for a picnic.");
        }
        else if (!isSunny) {
            System.out.println("The weather is not sunny. It might be better to postpone the picnic.");
        }
        else {
            System.out.println("The weather is neither sunny nor pleasant. It's best to postpone the picnic.");
        }
    }
}