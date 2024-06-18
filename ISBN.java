/**ISBN is a unique numeric book identifier printed on every book.
 * It is based upon a 10-digit code. The ISBN is legal if :
 * 1*digit1 + 2*digit2 + 3*digit3 + 4*digit4 + 5*digit5 + 6*digit6 + 
 * 7*digit7 + 8*digit8 + 9*digit9 + 10*digit10 is divisible by 11.
 * The ISBN code must be a 10-digit integer.
 */
import java.util.*;
class ISBN
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int d;
        long num=0,n;
        System.out.println("Enter an International Standard Book Number (ISBN) to check if it is legal (you can press 0 to exit):-");
        while (count!=10)
        {
        num=sc.nextLong();
        n=num;
        count=0;
        if (num==0)
        System.exit(0);
        while (n!=0)
        {
           d=(int)n%10;
           count++;
           n=n/10;
        }
        if (count==10)
        break;
        System.out.println("The ISBN should be a 10-digit number!!");
        System.out.println("Try Again OR Press 0 to exit");
        }
        System.out.println();
        int s=0;
        n=num;
        for (int i=10;i>=1;i--)
        {
            d=(int)n%10;
            s=s+d*i;
            n=n/10;
        }
        if (s%11==0)
        System.out.println(num+" is a VALID ISBN CODE.");
        else
        System.out.println(num+" is an INVALID ISBN CODE.");
    }
}