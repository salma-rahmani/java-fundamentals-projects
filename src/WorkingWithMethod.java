public class WorkingWithMethod {
    public static void main(String[] args) {
        printMessage();
        System.out.println(sumMethod(20, 35));
    }

    public static void printMessage() {
        System.out.println("This is my first java method!!");
    }

    public static int sumMethod(int a, int b) {
        return a + b;
    }
}
