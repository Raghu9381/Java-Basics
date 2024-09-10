import java.util.Scanner;
public class PrimeNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check whether it is a prime number: ");
        int num = sc.nextInt();
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        sc.close();
    }

    public static boolean isPrime(int num) {
        // Handle edge cases
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        if (num <= 3) {
            return true; // 2 and 3 are prime numbers
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false; // Multiples of 2 and 3 are not prime
        }
        
        // Check for factors from 5 to sqrt(num)
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        
        return true;
    }

    
}
