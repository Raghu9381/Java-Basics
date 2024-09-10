public class EvenUsingWhile 
{
      public static void main(String[] args) 
    {
        //printing even numbers using while loop
        System.out.println("Even numbers between 10 and 100:");
        int i = 10;
        while(i<=100)
        {
            if(i%2==0)
            {
                System.out.print(i+" ");
            }
            i++;
        }
            
    }
    
}
