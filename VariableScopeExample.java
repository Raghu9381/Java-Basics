public class VariableScopeExample {
    // Global (instance) variable
    int number = 10;

    public void displayNumber() {
        // Local variable with the same name as the global variable
        int number = 20;

        // Print the local variable
        System.out.println("Local variable 'number': " + number);

        // Print the global variable using 'this' keyword
        System.out.println("Global variable 'number': " + this.number);
    }

    public static void main(String[] args) {
        // Create an instance of the class
        VariableScopeExample example = new VariableScopeExample();

        // Call the method to display numbers
        example.displayNumber();
    }
}
