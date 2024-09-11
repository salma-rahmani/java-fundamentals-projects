import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create arrays for employee names and salaries
        String[] names = new String[numEmployees];
        double[] salaries = new double[numEmployees];

        // Get the name and salary of each employee
        for (int i = 0; i < numEmployees; i++) {
            System.out.print("Enter the name of employee " + (i + 1) + ": ");
            names[i] = scanner.nextLine();

            System.out.print("Enter the salary of employee " + (i + 1) + ": ");
            salaries[i] = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character
        }

        System.out.println("\nEmployee Details:");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Name: " + names[i] + ", Salary: " + salaries[i]);
        }

        scanner.close();
    }
}
