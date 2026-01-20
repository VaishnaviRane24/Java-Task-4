import java.util.*;

// Method overloading, pass-by-value
// Exception handling and reusable methods
public class Calculator {

    // Addition (int)
    static int add(int a, int b) {
        return a + b;
    }

    // Addition (double) - Method Overloading
    static double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    static int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication
    static int multipy(int a, int b) {
        return a * b;
    }

    // Division with exception handling
    static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return (double) a / b;
    }

    static void modifyValue(int x) {
        x = x + 10;
        System.out.println("Inside modifyValue method: " + x);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("-------- Modular Calculator --------");

        System.out.print("Enter First Number:");
        int a = sc.nextInt();

        System.out.print("Enter Second Number:");
        int b = sc.nextInt();

        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Multiplication: " + multipy(a, b));

        try {
            System.out.println("Division: " + divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Method overloading
        System.out.println("Addition (double): " + add(10.0, 20.0));

        // Pass-by-value
        int value = 5;
        System.out.println("Before modifyValue: " + value);
        modifyValue(value);
        System.out.println("After modifyValue: " + value);
    }
}
