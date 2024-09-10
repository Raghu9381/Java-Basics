import java.util.Scanner;

public class NumberEqualityCheck {

    // Method to check if two numbers are equal
    public static void checkIfEqual(int num1, int num2) {
        if (num1 == num2) {
            System.out.println(num1 + " and " + num2 + " are equal.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not equal.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers from the user
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Call the method to check if the numbers are equal
        checkIfEqual(number1, number2);

        scanner.close();
    }
}

