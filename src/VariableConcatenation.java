public class VariableConcatenation {

    /*
    4. Variable Concatenation:
    You have two string variables: firstName = "John" and lastName = "Doe".
    Create a third variable, fullName, by combining the first two variables with a space in between.
    Display the full name.
    */

    public static void main(String[] args) {
        // Define the first name
        String firstName = "John";

        // Define the last name
        String lastName = "Doe";

        // Concatenate first name and last name with a space in between
        // Assign the concatenated result to the fullName variable
        String fullName = firstName + " " + lastName;

        // Print the full name to the console
        System.out.println("Full Name: " + fullName);
    }
}
