/**To input an integer and check whether it is a
 * magic number or not If you iterate the process of 
 * summing the digits of a number
 * and if this process terminates in 1, then the
 * original number is called a MAGIC NUMBER.
 */
import java.util.*;
public class Magic_Number
{
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer to see if it is a magic number :-");
        int num=scan.nextInt();
        System.out.println();
        int n=num;
        int digit;
        int s=0;
        s=n;
        do
        {
            n=s;
            s=0;
            while(n!=0)
            {
                digit=n%10;
                s=s+digit;
                n=n/10;
            }
        }
        while (s>=10);
        if (s==1)
        System.out.println(num+" is A MAGIC NUMBER.");
        else
        System.out.println(num+" is NOT A MAGIC NUMBER.");
    }
}