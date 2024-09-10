public class EvenOrOdd 
{
     public static void main(String[] args) 
    {
        findEvenOrOdd(616);
    }
    public static void findEvenOrOdd(int num)
    {
        switch (num%2) 
        {
            case 0: System.out.println(num+" is a Even number.");
                
                break;
        
            default:System.out.println(num+" is a Odd number.");
                break;
        }
    }
    
    
}
