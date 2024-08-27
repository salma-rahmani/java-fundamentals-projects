public class VariableConcatenation {

    /*
    4. Variable Concatenation:
You have two string variables: firstName = "John" and lastName = "Doe".
 Create a third variable, fullName, by combining the first two variables with a space in between.
 Display the full name.
     */


    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";

        String fullName = firstName + " " + lastName;

        System.out.println("Full Name: " + fullName);
    }
}
