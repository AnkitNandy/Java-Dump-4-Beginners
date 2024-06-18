/**Write a function fact(int n) to find the 
 * factorial of a number n. Include a main
 * class to find the value of S, where:
 *    
 * S = (n!) / (m!(n-m)!)
 */
import java.util.*;
class Function_Factorial
{
    int fact(int n)
    {
        int a=1;
        for (int i=1;i<=n;i++)
        {
            a=a*i;
        }
        return a;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("S = (n!) / (m!(n-m)!)\n");
        System.out.println("Enter the value of n :");
        int n=sc.nextInt();
        Function_Factorial obj=new Function_Factorial();
        int f1=obj.fact(n);//factorial of n
        System.out.println("Enter the value of m :");
        int m=sc.nextInt();
        int f2=1;
        for (int i=1;i<=m;i++)
        {
            f2=f2*i;//factorial of m
        }
        int f3=1;
        for (int i=1;i<=(n-m);i++)
        {
            f3=f3*i;//factorial of n-m
        }
        int S=f1/(f2*f3);
        System.out.println("\nThe value of S = "+S);
    }
}