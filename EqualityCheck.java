public class EqualityCheck {

    // Method to check equality and inequality between two numbers
    public static void checkEquality(int num1, int num2) {
        // Check if the numbers are equal using ==
        if (num1 == num2) {
            System.out.println(num1 + " is equal to " + num2);
        } else {
            System.out.println(num1 + " is not equal to " + num2);
        }

        // Check if the numbers are not equal using !=
        if (num1 != num2) {
            System.out.println(num1 + " is not equal to " + num2);
        } else {
            System.out.println(num1 + " is equal to " + num2);
        }
    }

    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;

        // Call the method to check equality and inequality
        checkEquality(number1, number2);
    }
}
