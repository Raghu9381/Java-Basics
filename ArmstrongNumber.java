import java.util.Scanner;
public class ArmstrongNumber 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check whether number is Armstrong or not :");
        int num = sc.nextInt();
        System.out.println(findArmstrong(num));
    }

    public static boolean findArmstrong(int num)
    {
        int original = num;
        double sum=0;  
        int digit;
        int length = String.valueOf(num).length();  
        while(num>0)
        {
            digit = num%10;
            sum += Math.pow(digit, length);
            num/=10;

        }
        return original==sum;
    }
    
}
