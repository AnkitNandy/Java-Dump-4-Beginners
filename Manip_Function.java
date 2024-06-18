/**Design a class to overload a function manip() as follows:
 * (i) void manip(String str,int p) with one string argument
 *     and one integer argument. It displays the characters 
 *     of even positions of String, if p is an even number otherwise, 
 *     it displays the characters of odd positions.
 * (ii) void manip(int a,char ch) with one integer argument and one 
 *      character argument. It computes the square root of the integer
 *      arguments if ch is 's', else it computes the cube root of integers.
 */
import java.util.*;
class Manip_Function
{
    void manip(String str,int p)
    {
        String s="";
        for (int i=0;i<str.length();i++)
        {
            if (p%2==0 && i%2!=0)
            {
                s=s+str.charAt(i);
            }
            else
            {
                s=s+str.charAt(i);
            }
        }
        if (p%2==0)
        {
            System.out.println("Characters at even positions :");
            System.out.println(s);
        }
        else
        {
            System.out.println("Characters at odd positions :");
            System.out.println(s);
        }
    }
    void manip(int a,char ch)
    {
        if (ch=='s'||ch=='S')
        System.out.println("Square root of "+a+" = "+Math.sqrt(a));
        else
        {
            for (int i=1;i<=a;i++)
            {
                if (i*i*i==a)
                System.out.println("Cube root of "+a+" = "+i);
            }
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Manip_Function obj=new Manip_Function();
        System.out.println("Enter the value of p:");
        int q=sc.nextInt();
        System.out.println("Enter string str:");
        String d=sc.next();
        System.out.println();
        obj.manip(d,q);
        System.out.println("Enter the value of a:");
        int num=sc.nextInt();
        System.out.println("Enter character ch:");
        char m=sc.next().charAt(0);
        System.out.println();
        obj.manip(num,m);
    }
}