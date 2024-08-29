public class AnotherActivity {

    public static void main(String[] args) {
        // Declare and initialize the stored password
        String storedPassword = "JavaRocks";  // The correct password stored in the system

        // Simulate user input by declaring the entered password
        String enteredPassword = "JavaRules";  // The password entered by the user

        // Check if the entered password matches the stored password
        if (storedPassword.equals(enteredPassword)) {
            // If passwords match, print a success message
            System.out.println("Login successful!");
        } else {
            // If passwords don't match, print an error message
            System.out.println("Incorrect password.");
        }
    }
}
