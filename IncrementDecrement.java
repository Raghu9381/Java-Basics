public class IncrementDecrement {

    // Method to increment and decrement a number
    public static void incrementDecrement(int num) {
        System.out.println("Initial value: " + num);

        // Increment the value by 1
        num++;
        System.out.println("After increment (++): " + num);

        // Decrement the value by 1
        num--;
        System.out.println("After decrement (--): " + num);
    }

    public static void main(String[] args) {
        int number = 10;
        incrementDecrement(number);
    }
}

