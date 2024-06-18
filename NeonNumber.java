/*To enter a number and check
 * whether the umber is 
 * Neon or not. A number is said t be Neon
 * if sum of the digits of the square of the number  
 * is equal to the number itsef.
 */
import java.util.*;
class NeonNumber
{
    int n,p,d,s=0;
    Scanner sc=new Scanner(System.in);
    public void InputData()
    {
        System.out.println("TO CHECK WHETHER A NUMBER ENTERED IS NEON OR NOT");
        System.out.println();
        System.out.println("Enter an integral number :-");
        n=sc.nextInt();
        
    }
    public void Calculate()
    {
        p=n*n;
        while (p!=0)
        {
            d=p%10;
            s=s+d;
            p=p/10;
        }
    }
    public void OutputData()
    {
        System.out.println();
        if (s==n)
        System.out.println(n+" is a NEON NUMBER.");
        else
        System.out.println(n+" is NOT A NEON NUMBER.");
    }
    public static void main()
    {
        NeonNumber obj=new NeonNumber();
        obj.InputData();
        obj.Calculate();
        obj.OutputData();
    }
}
