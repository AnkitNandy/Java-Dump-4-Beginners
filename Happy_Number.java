package Tution;

/**To input an integer and check whether
 * it is a Happy Number or not. If you
 * iterate the process of summing the
 * squares of the digits of a number and
 * if this process terminates in 1, then
 * the original number is called HAPPY NUMBER.
 */
import java.util.*;
public class Happy_Number
{
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer to see if it is an happy number :-");
        int num=scan.nextInt();
        System.out.println();
        int s,digit=0;
        int n=num;
        s=n;
        while (s>=10)
        {
            n=s;
            s=0;
            while (n!=0)
            {
                digit=n%10;
                s=s+(int)digit*digit;
                n=n/10;
            }
        }
        if (s==1)
        System.out.println(num+" is A HAPPY NUMBER.");
        else
        System.out.println(num+" is NOT A HAPPY NUMBER.");
    }
}