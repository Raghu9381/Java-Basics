public class EvenOddNumbers 
{
    public static void main(String[] args) 
    {
        System.out.println("Printing Even and Odd numbers:\n");

        System.out.println("Odd Numbers");
        for(int i=1;i<10;i++)
        {
            if(i%2!=0)
            {
                System.out.print(i+" ");
            }
        }

        System.out.println("\nEven Numbers");
        for(int i=1;i<=10;i++)
        {
            if(i%2==0)
            {
                System.out.print(i+" ");
            }
        }




        
    }
    
}
