final class FinalExample {

    final int notChangedVar = 200;


    public final void printMessage() {
        System.out.println("The final variable value is: " + notChangedVar);
    }

    public void print() {
        System.out.println("Hello Humans!");
    }

    public static void main(String[] args) {

        FinalExample obj = new FinalExample();

        obj.printMessage();
        obj.print();
    }
}
