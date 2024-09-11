/*
Reverse a string: Write a loop that reverses a given string without using built-in functions.


 */
public class LoopExampleReverse {
    public static void main(String[] args) {
        String sentence = "Just for practice!";
        String reversed = "";
        for (int i = sentence.length()-1; i >= 0; i--) {
            reversed += sentence.charAt(i);
        }
            System.out.println(reversed);

    }
}

