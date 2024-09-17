import javax.xml.validation.SchemaFactoryConfigurationError;
import java.util.Arrays;

public class WorkingWithLoops {
    public static void main(String[] args) {
        String message = "Java is so easy!";
//        message = message.replaceAll(" ", "");
//
//        for (int i = 0; i < message.length(); i++)
//            System.out.print(message.charAt(i));
//

        char[] characters = message.toCharArray();
        System.out.println(Arrays.toString(characters));
//        for (char character : characters)
//            System.out.println(character);

        for (char character : message.replaceAll(" ", "").toCharArray())
            System.out.print(character + " ");


        // some methods of Character class such as Chracter.toLowerCase, Character.ToUpperCase , Character.toDigit
        // if our String has numbers, lowercase character and uppercase character
        System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *  ");
        String longMessage = "JOHN smith 1998 !!!&&**";

        System.out.println(longMessage.replaceAll("[^A-Z]", ""));
        System.out.println(longMessage.replaceAll("[^a-z]", ""));
        System.out.println(longMessage.replaceAll("[^0-9]", ""));
        System.out.println(longMessage.replaceAll("[A-Za-z0-9]", "").replaceAll(" ", ""));
        System.out.println(" * * * * * * * * * * * * * * * * * * * *");
        char[] example = longMessage.toCharArray();

        for (char character : longMessage.replaceAll(" ", "").toCharArray())
            if (Character.isLowerCase(character)) {
                System.out.print(character);
            }
        System.out.println();
        for (char character : longMessage.replaceAll(" ", "").toCharArray())
            if (Character.isUpperCase(character)) {
                System.out.print(character);
            }
        System.out.println();
        for (char character : longMessage.replaceAll(" ", "").toCharArray())
            if (Character.isDigit(character)) {
                System.out.print(character);
            }

        // to print only lower case characters
        //System.out.println(Character.isLowerCase(example));


    }
}

