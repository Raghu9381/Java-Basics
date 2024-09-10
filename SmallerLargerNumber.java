import java.util.Scanner;

public class SmallerLargerNumber {

    // Method to find and print the smaller and larger number
    public static void findSmallerAndLarger(int num1, int num2) {
        if (num1 < num2) {
            System.out.println(num1 + " is the smaller number.");
            System.out.println(num2 + " is the larger number.");
        } else if (num1 > num2) {
            System.out.println(num1 + " is the larger number.");
            System.out.println(num2 + " is the smaller number.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers from the user
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Call method to find and print the smaller and larger number
        findSmallerAndLarger(number1, number2);

        scanner.close();
    }
}

