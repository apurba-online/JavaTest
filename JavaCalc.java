import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("-----------------");

        // Get user input for two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform calculations using methods
        double sumResult = add(num1, num2);
        double differenceResult = subtract(num1, num2);
        double productResult = multiply(num1, num2);
        double quotientResult = divide(num1, num2);

        // Display results
        System.out.println("Sum: " + sumResult);
        System.out.println("Difference: " + differenceResult);
        System.out.println("Product: " + productResult);
        System.out.println("Quotient: " + quotientResult);

        scanner.close();
    }

    // Method to add two numbers
    public static double add(double a, double b) {
        return a + b;
    }

    // Method to subtract two numbers
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method to multiply two numbers
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method to divide two numbers (checks for division by zero)
    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN; // NaN (Not a Number) represents an undefined result
        }
    }
}
