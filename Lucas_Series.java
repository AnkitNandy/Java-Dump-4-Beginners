/**To print the sum of 1st 10 numbers
 * of the Lucas Series, i.e. 2,1,
 * 3,4,7,11,18,..... . Lucas Series
 * is such a series which starting
 * from 2 and 1, and subsequent 
 * numbers are the sum of previous 
 * two numbers.
 */
public class Lucas_Series
{
    public static void main()
    {
        int a=2,b=1;
        int sum=0;
        System.out.println("First ten numbers of the Lucas Series :-");
        System.out.print(a+", "+b+", ");
        for (int i=1;i<=8;i++)
        {
            sum=a+b;
            a=b;
            b=sum;
            if (i==8)
            System.out.print(sum+".");
            else
            System.out.print(sum+", ");
        }
    }
}