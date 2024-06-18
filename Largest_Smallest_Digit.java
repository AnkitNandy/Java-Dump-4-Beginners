/**To pass an integer as argument
 * and then to print the largest 
 * as well as the smallest digit.
 */
public class Largest_Smallest_Digit
{
    public static void main(int num)
    {
        int n=num;
        int largest=0,smallest=0;
        int digit=0;
        smallest=n%10;
        largest=0;
        while (num!=0)
        {
            digit=num%10;
            num=num/10;
            if (digit>largest)
            largest=digit;
            if (digit<smallest)
            smallest=digit;
        }
        System.out.println("Largest digit of "+n+" = "+largest);
        System.out.println("Smallest digit of "+n+" = "+smallest);
    }
}