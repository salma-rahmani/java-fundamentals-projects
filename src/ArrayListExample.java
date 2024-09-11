import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();


        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Honda");


        System.out.println("Car list: " + cars);

        System.out.println("The car at index 1 is: " + cars.get(1));

        cars.remove("Honda");
        System.out.println(cars);
    }
}
