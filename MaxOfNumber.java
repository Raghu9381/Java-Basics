public class MaxOfNumber 
{
    public static void main(String[] args) 
    {
        System.out.print("Maximum of given three numbers is: ");
        System.out.println(findMax(5, 2, 3));

        
    }
    public static int findMax(int num1,int num2,int num3)
    {
        if(num1>num2 && num1>num3)
        {
            return num1;
        }
        else if (num2>num1 && num2>num3)
        {
            return num2;
        } 
        else
        return num3;
    }
    
}
