import java.util.*;
class GCD
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers to find their HCF or GCD:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int r=0;
        System.out.print("\nHCF of "+a+" and "+b+" = ");
        while (a%b!=0)
        {
            r=a%b;
            a=b;
            b=r;
        }
        System.out.println(b);
    }
}    