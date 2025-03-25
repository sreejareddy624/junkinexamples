import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for two numbers (r1 and r2)
        System.out.print("Enter first number (r1): ");
        double r1 = scanner.nextDouble();

        System.out.print("Enter second number (r2): ");
        double r2 = scanner.nextDouble();

        // Perform arithmetic operations
        double sum = r1 + r2;
        double difference = r1 - r2;
        double product = r1 * r2;
        double quotient = (r2 != 0) ? (r1 / r2) : Double.NaN; // Check for division by zero

        // Display the results
        System.out.println("\nArithmetic Operations:");
        System.out.println("Addition (r1 + r2): " + sum);
        System.out.println("Subtraction (r1 - r2): " + difference);
        System.out.println("Multiplication (r1 * r2): " + product);
        if (Double.isNaN(quotient)) {
            System.out.println("Division (r1 / r2): Cannot divide by zero.");
        } else {
            System.out.println("Division (r1 / r2): " + quotient);
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

