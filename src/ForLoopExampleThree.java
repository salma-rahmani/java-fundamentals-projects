public class ForLoopExampleThree {
    public static void main(String[] args) {

        String text = " Hello World!111";
        System.out.println(text.replace("[a-z]", ""));

        System.out.println(text.replace("[A-Z]", ""));

        System.out.println(text.replace("[0-9]", ""));


        System.out.println("*********************************");

//        for (char character : text.replace(" ", "").toCharArray());
//        System.out.println(character);




    }
}
