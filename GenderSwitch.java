import java.util.Scanner;

public class GenderSwitch {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter M for Male or F for Female: ");
        char gender = sc.next().charAt(0);

        switch (gender)
         {
            case 'M':
            case 'm':
                System.out.println("Male");
                break;
            case 'F':
            case 'f':
                System.out.println("Female");
                break;
            default:
                System.out.println("Invalid input. Please enter M or F.");
              
                break;
        }
        sc.close();
    }
}

