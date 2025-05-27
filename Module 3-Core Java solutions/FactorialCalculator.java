import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for non-negative integer
        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();

        // Input validation
        if (num < 0) {
            System.out.println("Invalid input. Please enter a non-negative integer.");
            return;
        }

        // Calculate factorial using a for loop
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        // Display the result
        System.out.println("Factorial of " + num + " is: " + factorial);
        scanner.close();
    }
}
