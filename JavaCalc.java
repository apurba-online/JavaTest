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

        double[] numbers = {num1, num2};

        // Perform calculations using methods
        double sumResult = add(numbers);
        double differenceResult = subtract(numbers);
        double productResult = multiply(numbers);
        double quotientResult = divide(numbers);

        // Display results
        System.out.println("Sum: " + sumResult);
        System.out.println("Difference: " + differenceResult);
        System.out.println("Product: " + productResult);
        System.out.println("Quotient: " + quotientResult);

        scanner.close();
    }

    // Method to add two numbers
    public static double add(double[] numbers, frac[] numbers) {
        return numbers[0] + numbers[1];
    }

    // Method to subtract two numbers
    public static double subtract(double[] numbers) {
        return numbers[0] - numbers[1];
    }

    // Method to multiply two numbers
    public static double multiply(double[] numbers) {
        return numbers[0] * numbers[1];
    }

    // Method to divide two numbers (checks for division by zero)
    public static double divide(double[] numbers) {
        if (numbers[1] != 0) {
            return numbers[0] / numbers[1];
        } else {
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN; // NaN (Not a Number) represents an undefined result
        }
    }
}
