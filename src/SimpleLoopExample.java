/*
printing numbers from 1 to 10 or summing an array of numbers. Gradually increase the complexity.
public class SimpleLoopExample {
 */
public class SimpleLoopExample {
    public static void main(String[] args) {
        for (int index = 1; index <= 100; index++) {
            if (index == 100) {
                System.out.println(index);
            } else System.out.print(index + ",");
        }
    }
}
