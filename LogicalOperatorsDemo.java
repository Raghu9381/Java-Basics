import java.util.Scanner;

public class LogicalOperatorsDemo {

    // Method demonstrating logical AND and OR
    public static void checkLogicalOperators(int num1, int num2) {
        // Logical AND (&&)
        if (num1 > 0 && num2 > 0) {
            System.out.println("Both numbers are positive (Logical AND).");
        } else {
            System.out.println("At least one of the numbers is not positive (Logical AND).");
        }

        // Logical OR (||)
        if (num1 > 0 || num2 > 0) {
            System.out.println("At least one of the numbers is positive (Logical OR).");
        } else {
            System.out.println("Both numbers are non-positive (Logical OR).");
        }
    }

    // Method demonstrating logical NOT
    public static void checkLogicalNot(boolean flag) {
        // Logical NOT (!)
        if (!flag) {
            System.out.println("The flag is false (Logical NOT).");
        } else {
            System.out.println("The flag is true (Logical NOT).");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers from the user
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Call method to check Logical AND and OR
        checkLogicalOperators(number1, number2);

        // Input a boolean value from the user for Logical NOT
        System.out.print("Enter a boolean value (true/false): ");
        boolean flag = scanner.nextBoolean();

        // Call method to check Logical NOT
        checkLogicalNot(flag);

        scanner.close();
    }
}

