public class AnotherActivity {

        public static void main(String[] args) {
            String storedPassword = "JavaRocks";

            String enteredPassword = "JavaRules";

            if (storedPassword.equals(enteredPassword)) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Incorrect password.");
            }
        }
    }

