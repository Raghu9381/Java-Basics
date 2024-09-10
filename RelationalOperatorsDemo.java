import java.util.Scanner;

public class RelationalOperatorsDemo {

    // Method to demonstrate relational operators
    public static void checkRelationalOperators(int num1, int num2) {
        // Less than (<)
        if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2);
        } else {
            System.out.println(num1 + " is not less than " + num2);
        }

        // Less than or equal to (<=)
        if (num1 <= num2) {
            System.out.println(num1 + " is less than or equal to " + num2);
        } else {
            System.out.println(num1 + " is not less than or equal to " + num2);
        }

        // Greater than (>)
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num1 + " is not greater than " + num2);
        }

        // Greater than or equal to (>=)
        if (num1 >= num2) {
            System.out.println(num1 + " is greater than or equal to " + num2);
        } else {
            System.out.println(num1 + " is not greater than or equal to " + num2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers from the user
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Call method to check relational operators
        checkRelationalOperators(number1, number2);

        scanner.close();
    }
}

