/**To input an integer and check whether it is 
 * Harshad or Niven Number or not. A number is 
 * said to be harshad if it is divisible by the
 * sum of the digits of that number.
 * Example:
 * 126 and 1729.
 */
import java.util.*;
public class Harshad_Or_Niven_Number
{
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer to see if it is Harshad or Niven Number :-");
        int num=scan.nextInt();
        System.out.println();
        int digit,sum=0;
        int n=num;
        while (n!=0)
        {
            digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        if (num%sum==0)
        System.out.println(num+" is HARSHAD or NIVEN NUMBER.");
        else
        System.out.println(num+" is NOT HARSHAD (NIVEN) NUMBER.");
    }
}