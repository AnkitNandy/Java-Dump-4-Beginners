/**A program to input 
 * three different 3 single digit numbers
 * between 1 and 9 (both inclusive).
 * Display the greatest and smallest
 * 3-digit number.
 */
import java.util.*;
public class GreatesrandSmallest3Digits
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,gn=0,sn=0;
        System.out.println("Enter three digits between 1 to 9:-");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if (a>b&&a>c)
        {
            if (b>c)
            {
                gn=100*a+10*b+c;
                sn=100*c+10*b+a;
            }
            else
            {
                gn=100*a+10*c+b;
                sn=100*b+10*c+a;
            }
        }
        if (b>a&&b>c)
        {
            if (a>c)
            {
                gn=100*b+10*a+c;
                sn=100*c+10*a+b;
            }
            else
            {
                gn=100*b+10*c+a;
                sn=100*a+10*c+b;
            }
        }
        if (c>a&&c>b)
        {
            if (a>b)
            {
                gn=100*c+10*a+b;
                sn=100*b+10*a+c;
            }
            else
            {
                gn=100*c+10*b+a;
                sn=100*a+10*b+c;
            }
        }
        if (a==b&&a==c)
        {
            if (b==c)
            {
                gn=100*a+10*b+c;
                sn=100*c+10*b+a;
            }
            else
            {
                gn=100*a+10*c+b;
                sn=100*b+10*c+a;
            }
        }
        if (b==a&&b==c)
        {
            if (a==c)
            {
                gn=100*b+10*a+c;
                sn=100*c+10*a+b;
            }
            else
            {
                gn=100*b+10*c+a;
                sn=100*a+10*c+b;
            }
        }
        if (c==a&&c==b)
        {
            if (a==b)
            {
                gn=100*c+10*a+b;
                sn=100*b+10*a+c;
            }
            else
            {
                gn=100*c+10*b+a;
                sn=100*a+10*b+c;
            }
        }
        System.out.println("The greatest number :"+gn);
        System.out.println("The smallest number :"+sn);
    }
}
            