/**To accept a number from user
 * and check whether it is an
 * niven number or not.
 * Niven:-Sum of its digits is
 * divisible by nine.
 */
import java.util.*;
public class Niven_Number
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        long n;//number entered
        long d;
        long s=0;//sum of digits
        System.out.println("TO CHECK IF NUMBER ENTERED IS NIVEN");
        System.out.println();
        System.out.println("Enter a number:-");
        n=sc.nextLong();
        if (s%9==0)
        System.out.println(n+" is a niven number.");
        else
        System.out.println(n+" is not a niven number.");
        while (n>0)
        {
            d=n%10;
            s=(int)(s+d);
            n=n/10;
        }
    }
}